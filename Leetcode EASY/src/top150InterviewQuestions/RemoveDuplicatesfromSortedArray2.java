package top150InterviewQuestions;

//Problem Statement :
//
//Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
//
//Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
//
//Return k after placing the final result in the first k slots of nums.
//
//Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
//
//Example 1:
//
//Input: nums = [1,1,1,2,2,3]
//Output: 5, nums = [1,1,2,2,3,_]

public class RemoveDuplicatesfromSortedArray2 {
	public int removeDuplicates(int[] nums) {
        int currEle = nums[0];
        int currCount = 1;
        
        int i=1;
        int j=1;
        while(i<nums.length){
            if(currCount<2 && nums[i]==currEle){
                nums[j++]=nums[i];
            }
            if(nums[i]==currEle){
                currCount++;
            }
            else{
                nums[j++]=nums[i];
                currEle = nums[i];
                currCount = 1;
            }
            i++;
        }

        return j;
    }
}
