/*
Number with equal digit sum
*/
public static int getDigits(int num) {
        int dupNum = num; // 51 71 17 42
        int sum = 0;
        while (dupNum > 0) {
            sum += dupNum % 10;
            dupNum /= 10;
        }
        return sum;
    }


public static int numWithEqualDigitSum(int[] nums){ // add to github tomorrow.
   if(nums == null || nums.length == 0)return -1;
   int maxSum = -1;
   int sum = 0;
   HashMap<Integer,Integer> map = new HashMap<>();
   for(int num:nums){
       sum = getDigits(num);
       if(!map.containsKey(sum)){
           map.put(sum,num);//  6 51 8 71 8 17 6 42 
       }
       else{
           maxSum = Math.max(maxSum,map.get(sum) + num);
       }
       System.out.println(maxSum + " " + sum);
   }

   return maxSum;
}
