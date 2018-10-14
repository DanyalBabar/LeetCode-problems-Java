/*
LeetCode Problem #217

Given an array of integers, find if the array contains any duplicates.
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Runtime: 16ms, 38.2th percentile.
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> numsNew = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            if (numsNew.contains(nums[i]))
                return true;
            else
                numsNew.add(nums[i]);
        }
        
        return false;
    }
}
