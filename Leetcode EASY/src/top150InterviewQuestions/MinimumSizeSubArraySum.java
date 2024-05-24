package top150InterviewQuestions;

//Problem Statement :
//
//Given an array of positive integers nums and a positive integer target, return the minimal length of a 
//subarray
// whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
//
//Example 1:
//
//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2

public class MinimumSizeSubArraySum {
	
	public int minSubArrayLen(int target, int[] nums) {
        int min = nums.length+1;
        int count = 0;
        int sum = 0;
        int s = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target) return 1;
            sum+=nums[i];
            count++;
            if(sum>=target){
                while(s<nums.length && sum>=target){
                    min = Math.min(min,count);
                    sum-=nums[s];
                    count--;
                    s++;
                }
            }
        }
        return min == nums.length+1 ? 0 : min;
    }
}
