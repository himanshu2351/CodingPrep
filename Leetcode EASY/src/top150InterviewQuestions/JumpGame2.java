package top150InterviewQuestions;

//Problem Statement :
//
//You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
//
//Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
//
//0 <= j <= nums[i] and
//i + j < n
//Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
//
//Example 1:
//
//Input: nums = [2,3,1,1,4]
//Output: 2

public class JumpGame2 {
	public int jump(int[] nums) {
        int n = nums.length-1;
        int count = 0;
        int l = 0, r = 0;
        while(r<n){
            int far = 0;
            for(int i=l;i<=r;i++){
                far = Math.max(far,i+nums[i]);
            }
            l = r+1;
            r = far;
            count++;
        }
        return count;
    }
}
