/*
Lexicographically smallest string formed by removing at most one character.

Example 1:

Input: "abczd"
Output: "abcd"
*/

public static String smallestLexicographicalString(String s){
   if(s.length() == 0 || s == null) return "";
   int max = Integer.MIN_VALUE;
   String res = "";
   for(int i = 0;i<s.length();i++){
       if(max < s.charAt(i) - 'a'){
           max = s.charAt(i) - 'a';
       }
   }
   for(int i=0;i<s.length();i++){
       if(s.charAt(i) - 'a'!=max){
           res += s.charAt(i);
       }
   }
   return res;
}
