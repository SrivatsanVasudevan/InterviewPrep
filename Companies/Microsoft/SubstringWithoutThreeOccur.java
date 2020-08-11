/*
Given a string s containing only a and b, find longest substring of s such that s does not contain more than two contiguous occurrences of a and b.

Example 1:

Input: "aabbaaaaabb"
Output: "aabbaa"
Example 2:

Input: "aabbaabbaabbaa"
Output: "aabbaabbaabbaa"
*/

public static String substringWithoutThreeOccur(String word){
   if(word.length() == 0 || word == null) return "";

   int i = 0;
   int count = 1;
   int max = Integer.MIN_VALUE;
   String substring = "";
   String result = word;
   for(int j=1;j<word.length() && i<word.length();j++){
       if(word.charAt(j)==word.charAt(j-1)){
           count++;
           if(count == 3){
               count = 1;
               substring = word.substring(i,j);
               i = j+1;
               if(max<substring.length()){
                   max = substring.length();
                   result = substring;
               }
           }
       }
       else{
           count = 1;
       }
   }
   return result;
}
