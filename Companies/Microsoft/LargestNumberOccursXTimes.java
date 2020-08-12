/*
Largest number X which occurs X times
*/

public static int largestNumberXTimes(int[] nums){
   if(nums == null || nums.length==0) return 0;

   HashMap<Integer,Integer> map = new HashMap<>();

   for(int i:nums){
       map.put(i,map.getOrDefault(i,0)+1); // 3 8 2 3 3 2
   }
   int max = 0;
   for(int i:map.keySet()){
       if(map.get(i)==i){
           max = Math.max(max, i);
       }
   }
   return max;
} 
