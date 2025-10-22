/**
 * 300. Longest Increasing Subsequence
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 * Example 1:
 * Input: nums = [10,9,2,5,3,7,101,18]
 * Output: 4
 *
 * Example 2:
 * Input: nums = [0,1,0,3,2,3]
 * Output: 4
 *
 * Example 3:
 * Input: nums = [7,7,7,7,7,7,7]
 * Output: 1
 */

class Solution {
    public int lengthOfLIS(int[] nums) {

        List<Integer> lis = new ArrayList<>();

        for(int num : nums){
            int idx = Collections.binarySearch(lis, num);

            if(idx<0) idx = -(idx+1);

            if(idx==lis.size()){
                lis.add(num);
            }
            else{
                lis.set(idx, num);
            }
        }

        return lis.size();
    }
}