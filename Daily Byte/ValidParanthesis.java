/*
This question is asked by Google. Given a string only containing the following characters (, ), {, }, [, and ] return whether or not the opening and closing characters are in a valid order.

Ex: Given the following strings...

"(){}[]", return true
"(({[]}))", return true
"{(})", return false
*/

public static boolean isValidParanthesis(String s){
        if(s == null || s.length() < 1)return true;
        
        Stack<Character> stack = new Stack();
        
        for(char c: s.toCharArray()){
            if(c == '(' || c == '[' ||c == '{'){
                stack.push(c);
            }
            else if(!stack.isEmpty() && stack.peek() == '(' && c == ')'){
                stack.pop();
            }
            else if(!stack.isEmpty() && stack.peek() == '[' && c == ']'){
                stack.pop();
            }
            else if(!stack.isEmpty() && stack.peek() == '{' && c == '}'){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
