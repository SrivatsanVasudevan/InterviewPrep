/*
Find the squared shortest distance between the robots.
*/

public static int squaredShortestDistance(int n, int[] X, int[] Y){
  Arrays.sort(X);
  Arrays.sort(Y);
  int min = Integer.MAX_VALUE; // sqrt((x1^2 - x2^2) + (y1^2 + y2^2))
  int sum = 0;
  for(int i = 0; i < n - 1; i++){
      sum = Math.abs((  (X[i]*X[i]) - (X[i+1]*X[i+1]) ) + (  (Y[i]*Y[i]) - (Y[i+1]*Y[i+1])  ));
      min = Math.min(min,sum);
  }
  return (int)min;
}
// TC: O(nlogn) SC: O(1)
