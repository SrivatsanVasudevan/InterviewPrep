/*
Min moves to obtain string without 3 identical consecutive letters
/*

public static int noThreeIdenticalConsecutive(String word){
   if(word == null || word.length() == 0)return 0;
   int count = 1;
   int res = 0;
   for(int i = 1;i < word.length(); i++){
       if(word.charAt(i)==word.charAt(i-1)){
           count++;
           if(count==3){
               res++;
               count = 1;
           }
       }
       else{
           count = 1;
       }
   }
   return res;
}
