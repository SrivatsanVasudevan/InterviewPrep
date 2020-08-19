/*
This question is asked by Google. Given two integer arrays, return their intersection.
Note: the intersection is the set of elements that are common to both arrays.

Ex: Given the following arrays...

nums1 = [2, 4, 4, 2], nums2 = [2, 4], return [2, 4]
nums1 = [1, 2, 3, 3], nums2 = [3, 3], return [3]
nums1 = [2, 4, 6, 8], nums2 = [1, 3, 5, 7], return []
*/

public static int[] intersectionofArrays(int[] nums1, int[] nums2){ 
  if(nums1 == null || nums2 == null || nums1.length < 1 || nums2.length < 1){
      return new int[]{};
  }
  HashSet<Integer> set = new HashSet<>();
  for(int i:nums1){
      set.add(i);
  }
  HashSet<Integer> intersection = new HashSet<>();

  for(int i:nums2){
      if(set.contains(i)){
          intersection.add(i);
      }
  }
  int res[] = new int[intersection.size()];
  int index = 0;
  for(int i:intersection){
      res[index++] = i;
  }
  return res;
}
