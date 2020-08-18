/*
Given a string and the ability to delete at most one character, return whether or not it can form a palindrome.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

Ex: Given the following strings...

"abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false
*/

public static boolean validPalindromeWithRemoval(String s){
 int i = 0;
 int j = s.length() - 1;
 while(i<j){
     if(s.charAt(i)!=s.charAt(j)){
         return validPalindrome(i+1,j,s) || validPalindrome(i,j-1,s);
     }
     else{
         i++;
         j--;
     }
 }
 return true;
}

public static boolean validPalindrome(int start, int end, String s){
 while(start<end){
     if(s.charAt(start)!=s.charAt(end)){
         return false;
     }
     else{
         start++;
         end--;
     }
 }
 return true;
}
