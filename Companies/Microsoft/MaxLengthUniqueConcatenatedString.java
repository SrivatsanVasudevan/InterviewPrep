/*
Maximum Length of a Concatenated String with Unique Characters

Given an array of strings arr. String s is a concatenation of a sub-sequence of arr which have unique characters.

Return the maximum possible length of s.

 

Example 1:

Input: arr = ["un","iq","ue"]
Output: 4
Explanation: All possible concatenations are "","un","iq","ue","uniq" and "ique".
Maximum length is 4.
Example 2:

Input: arr = ["cha","r","act","ers"]
Output: 6
Explanation: Possible solutions are "chaers" and "acters".
Example 3:

Input: arr = ["abcdefghijklmnopqrstuvwxyz"]
Output: 26
 

Constraints:

1 <= arr.length <= 16
1 <= arr[i].length <= 26
arr[i] contains only lower case English letters.
*/

class Solution {
    int result = 0;
    public int maxLength(List<String> arr) {
        /*
        int result[] = new int[1];
        helper(arr,0,"",result);
        return result[0];
    }
    public void helper(List<String>arr, int index, String current, int[] result){
        if(index==arr.size() && getUniqueCharCount(current)>result[0]){
            result[0] = current.length();
            return;
        }
        if(index==arr.size()){
            return;
        }
        helper(arr,index+1,current,result); // not taking the char at the index
        helper(arr,index+1,current + arr.get(index),result);// taking the char
        
    }
    public int getUniqueCharCount(String current){
        int char_map[] = new int[26];
        for(char c:current.toCharArray()){
            if(char_map[c-'a']++>0){
                return -1;
            }
        }
        return current.length();
        */
        
        if(arr == null || arr.size() == 0){
            return 0;
        }
        dfs(arr,"",0);
        return result;
    }
    
    public void dfs(List<String> arr, String path, int index){
        boolean uniqueChars = checkUnique(path);
        if(uniqueChars){
            result = Math.max(path.length(),result);
        }
        if(index==arr.size() || !uniqueChars){
            return;
        }
        for(int i=index;i<arr.size();i++){
            dfs(arr,path + arr.get(i),i+1);
        }
    }
    public boolean checkUnique(String path){
        int char_map[] = new int[26];
        for(int i=0;i<path.length();i++){
            if(char_map[path.charAt(i)-'a']++ > 0){
                return false;
            }
        }
        return true;
    }
}
