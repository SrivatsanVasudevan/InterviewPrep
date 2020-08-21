/*
Write a function that returns the maximum possible value obtained by inserting one '5' digit inside the decimal representation of integer N.

examples:
input: 1234 -> output: 51234
input: 7643 -> output 76543
input: 0 -> output 50
input: -661 -> output -5661
*/


public static int maxValueOfNumber(int num){
        boolean isNegative = false;
        if(num<0){
            isNegative = true;
            num = num * -1;
        }
        String res = "";
        if(!isNegative){
            String temp = "" + num;
            for(int i=0;i<temp.length();i++){
                int n = Integer.parseInt("" + temp.charAt(i));
                if(5 > n){
                    res += temp.substring(0,i) + "5" + temp.substring(i);
                    break;
                }
            }
            if(res.length() == 0)res += "5";
        }
        else{
            String temp = "" + num;
            for(int i=0;i<temp.length();i++){
                int n = Integer.parseInt("" + temp.charAt(i));
                if(5 < n){
                    res += temp.substring(0,i) + "5" + temp.substring(i);
                    break;
                }
            }
        }
        return isNegative ? -1* Integer.parseInt(res) : Integer.parseInt(res);
    }
