/*
M-Countdown
*/

public static int mCountDown(int n, int k, int arr[]){
        if(k==0 || arr.length < 1 || arr == null) return 0;
        int result = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=k)continue;
            int n1 = k;
            while(n1>0){
                if(arr[i] - arr[i+1] != 1){
                    break;
                }
                n1--;
            }
            if(n1 == 0){
                result++;
            }
        }
        return result;
    }
