/*

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Algo: reverse full, reverse till 0 to k and k to end
*/

class Solution {
    public void rotate(int[] nums, int k) {

      int k = k % nums.length;
      reverse(nums,0,nums.length-1);
      reverse(nums,0,k-1);
      reverse(nums,k,nums.length-1);
    }

    public void reverse(int[] num, int start, int end){
      while(start<end){
        int num[temp] = num[start];
        num[start] = num[end];
        num[end] = num[temp];
        start++;end--;
      }
   }
}
