/*
Widest Path without trees
*/

public static int widestPathWithoutTrees(int[] A, int[] B){
  if(A.length!=B.length)return 0;
  int ans = 1;
  int max = 0;
  Arrays.sort(A);
  for(int i=0;i<A.length -1;i++){
      max = Math.max(max, A[i+1] - A[i]);
      ans = max;
  }
  return ans;
}
