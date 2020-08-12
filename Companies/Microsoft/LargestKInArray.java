/*
Write a function that, given an array A of N integers, returns the lagest integer K > 0 such that both values K and -K exist in array A. If there is no such integer, the function should return 0.

Example 1:

Input: [3, 2, -2, 5, -3]
Output: 3
Example 2:

Input: [1, 2, 3, -4]
Output: 0
*/

public static int largestKInArray(int[] nums){
   if(nums.length <= 1 || nums == null) return 0; 
   int res = 0;
   HashSet<Integer> set = new HashSet<>();
   int max = 0;
   for(int i=0;i<nums.length;i++){
       if(!set.contains(nums[i])){
           set.add(-nums[i]);
       }
       else{
           res = - nums[i];
           max = Math.max(max,res);
       }
   }

   return max;
}
