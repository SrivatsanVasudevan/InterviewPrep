/*
Given a string, what is the minimum number of adjacent swaps required to convert a string into a palindrome. If not possible, return -1.

Practice online: https://www.codechef.com/problems/ENCD12

Example 1:

Input: "mamad"
Output: 3
Example 2:

Input: "asflkj"
Output: -1
Example 3:

Input: "aabb"
Output: 2
Example 4:

Input: "ntiin"
Output: 1
Explanation: swap 't' with 'i' => "nitin"
*/



public static void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    
    public static boolean isShuffledPalindrome(String s){
        int[] char_map = new int[26];
        
        for(int i=0;i<s.length();i++){
            char_map[s.charAt(i) - 'a']++;
        }
        int frequency = 0;
        for(int i=0;i<char_map.length;i++){
            if(char_map[i]%2!=0)frequency++;
        }
        return frequency<=1;
    }
    
    public static int minSwapsToMakePalindrome(String s){
        if(s.length()< 1 || s == null) return 0;
        
        int totalSwaps = 0;
        
        if(isShuffledPalindrome(s)){
            char ch[] = s.toCharArray();
            int p1 = 0;
            int p2 = ch.length - 1;
            while(p1<p2){
                if(ch[p1]!=ch[p2]){
                    int k = p2;
                    while(k > p1 && ch[k] != ch[p1]){
                        k--;
                        if(k==p1){
                            swap(ch,p1,p1+1);
                            totalSwaps++;
                        }
                        else{
                            while(k<p2){
                                swap(ch,k,k+1);
                                totalSwaps++;
                                k++;
                            }
                            p1++;
                            p2--;
                        }
                    }
                }
                else{
                    p1++;
                    p2--;
                }
            }
            return totalSwaps;
        }
        else{
            return -1;
        }
        
    }
