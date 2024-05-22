package top150InterviewQuestions;

//Problem Statement :
//
//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//
//Return true if you can reach the last index, or false otherwise.
//
//Example 1:
//
//Input: nums = [2,3,1,1,4]
//Output: true

public class JumpGame {
	
	public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        int i=0;
        int index = nums.length-1;
        for(i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=index){
                index=i;
            }
        }
        if(index==0) return true;
        return false;
    }
	
}
