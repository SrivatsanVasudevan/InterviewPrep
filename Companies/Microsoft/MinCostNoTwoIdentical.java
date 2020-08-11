/*
Min Moves to Obtain String Without 3 Identical Consecutive Letters
https://leetcode.com/discuss/interview-question/558379/
*/

public static int minCostNoTwoConsecutive(String s, int[] costs){
   if(s == null || s.length() == 0)return 0;
   if(s.length()!=costs.length)return 0;
   int minCost = 0;
   int min = 0;
   for(int i = 1; i<s.length(); i++){ 
       min = 0;
       if(s.charAt(i)==s.charAt(i-1)){
           min = Math.min(costs[i-1],costs[i]);
           minCost += min;
       }
   }
   return minCost;
}
