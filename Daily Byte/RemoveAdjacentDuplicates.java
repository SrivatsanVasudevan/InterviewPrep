/*
This question is asked by Facebook. Given a string s containing only lowercase letters, continuously remove adjacent characters that are the same and return the result.

Ex: Given the following strings...

s = "abccba", return ""
s = "foobar", return "fbar"
s = "abccbefggfe", return "a"
*/

public static String removeAdjacentDuplicates(String word){
        if(word.length() < 1)return word;
        
        Stack<Character> stack = new Stack<>();
        
        for(char c:word.toCharArray()){
            if(!stack.isEmpty() && c == stack.peek()){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
