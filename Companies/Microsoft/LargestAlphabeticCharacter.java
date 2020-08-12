/*
Given a string S, find the largest alphabetic character, whose both uppercase and lowercase appear in S. The uppercase character should be returned. For example, for S = "admeDCAB", return "D". If there is no such character, return "NO".
*/

public static String largestAlphabeticCharacter(String word){
   if(word.length() == 0 || word == null) return "NO";
   boolean check = false;
   char words[] = word.toCharArray();
   for(char c:words){
       if(Character.isLowerCase(c)){
           check = true;
       }
       else{
           check = false;
           break;
       }
   }
   if(check)return "NO";
   int max = Integer.MIN_VALUE;
   for(int i = 0;i<word.length();i++){
       if(Character.isUpperCase(word.charAt(i))){
           max = Math.max(max,word.charAt(i)-'a');
       }
   }
   return "" + (char)(max + 'a');
}
