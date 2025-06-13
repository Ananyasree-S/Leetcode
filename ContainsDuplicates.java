/*

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true

use hashset

*/

class Solution {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
           if(hs.contains(nums[i])){ return true;}
          hs.add(nums[i]);
        }
      return false;
    }
}

