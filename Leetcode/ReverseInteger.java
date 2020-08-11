/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
*/

class Solution {
  public int reverse(int x) {
      boolean negative = false;
      long result = 0;
      if(x<0){
          negative = true;
          x *= -1;
      }
      while(x>0){
          result = result*10 + x%10;
          x=x/10;
      }

      if(result>Integer.MAX_VALUE)return 0;

      if(negative){
          return (int)result*-1;
      }
      return (int)result;
  }
}
