/*
Meeting Rooms - Leetcode Question
*/

public static boolean meetingRooms(int[][] nums) {
  Arrays.sort(nums, (a, b) -> a[0] - b[0]);
  boolean check = false;
  for (int i = 0; i < nums.length-1; i++) {
      if (nums[i][1] <= nums[i + 1][0]) {
          check = true;
      } else {
          return false;
      }
  }
  return check;
}
