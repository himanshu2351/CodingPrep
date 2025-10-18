/**
 * 198. House Robber
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 *
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 *
 * Example 2:
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.
 */

class Solution {
    public int rob(int[] nums) {

        int[] temp = new int[nums.length];
        Arrays.fill(temp,-1);

        help(nums,temp,0);

        return temp[0];
    }

    public int help(int[] nums, int[] temp, int idx){
        if(idx>=nums.length){
            return 0;
        }

        if(temp[idx]!=-1) return temp[idx];

        int sel = nums[idx] + help(nums, temp, idx+2);
        int notSel = help(nums, temp, idx+1);

        return temp[idx] = Math.max(sel, notSel);
    }
}