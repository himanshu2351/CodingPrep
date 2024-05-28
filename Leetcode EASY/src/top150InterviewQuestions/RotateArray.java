package top150InterviewQuestions;

//Problem Statement :
//
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//
//Example 1:
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
		
public class RotateArray {
	public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    public void reverse(int[] nums,int i, int j){
        while(i<j){
            int t = nums[i];
            nums[i++] = nums[j];
            nums[j--] = t;
        }
    }
}
