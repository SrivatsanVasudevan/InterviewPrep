/*
Q1. Maximum arithmetic subsequence in array
*/

public static int longestSubsequenceInArray(int n, int [] nums){
        if(nums == null || n == 0) return 0;
        
        int max = Integer.MIN_VALUE;
        int count = 2;
        
        for(int i = 1;i<n - 1; i++){
            if(nums[i-1] - nums[i] == nums[i] - nums[i+1]){
                count++;
            }
            else{
                count = 2;
            }
            max = Math.max(max,count);
        }
        return max;
        
    }
