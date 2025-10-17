/**
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(0, 1);
        int sum = 0, ans = 0;
        for(int x : nums){
            sum += x;
            if(hs.containsKey(sum-k)) ans+=hs.get(sum-k);
            hs.put(sum, hs.getOrDefault(sum,0)+1);
        }

        return ans;
    }
}