package top150InterviewQuestions;

//Problem Statement :
//
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]
		
public class ProductOfArrayExceptSelf {
	
	public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int prod = 1;
        res[0] = prod;

        for(int i=1;i<n;i++){
            prod = prod*nums[i-1];
            res[i] = prod;
        }

        prod = 1;
        for(int i=n-2;i>=0;i--){
            prod *= nums[i+1];
            res[i] *= prod;
        }

        return res;
    }
}
