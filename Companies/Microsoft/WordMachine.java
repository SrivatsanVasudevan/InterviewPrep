/*
Word Machine
https://leetcode.com/discuss/interview-question/760379/Microsoft-or-OA-2020-or-Word-Machine
*/

public static int wordMachine(String s){
   if(s == null || s.length() == 0 )return -1;
   Stack<String> stack = new Stack<>();
   String sequences[] = s.split(" ");
   int sum = 0, difference = 0;
   int a = 0, b =0;
   for(String sequence:sequences){
       System.out.println(stack.toString());
       if(sequence.equals("DUP")){
           if(!stack.isEmpty()){
               stack.push(stack.peek());
           }
           else{
               return -1;
           }
       }
       else if(sequence.equals("POP")){ // 13 DUP 4 POP 5 DUP + DUP + - 13 7
           if(!stack.isEmpty()){
               stack.pop();
           }
           else{
               return -1;
           }
       }
       else if(sequence.equals("+")){
           if(!stack.isEmpty()){
               a = Integer.parseInt(stack.pop());
               if(!stack.isEmpty()){
                   b = Integer.parseInt(stack.pop());
               }
               else{
                   return -1;
               }
               sum = a + b;
           }
           else{
               return -1;
           }
           stack.push("" + sum);
       }
       else if(sequence.equals("-")){
           if(!stack.isEmpty()){
               a = Integer.parseInt(stack.pop());
               if(!stack.isEmpty()){
                   b = Integer.parseInt(stack.pop());
               }
               else{
                   return -1;
               }
           }
           else{
               return -1;
           }
           difference = a-b;
           if(difference < 0)return -1;
           stack.push("" + difference);
       }
       else{
           stack.push(sequence);
       }
   }
   if(!stack.isEmpty())return Integer.parseInt(stack.pop());
   else return -1;
}
