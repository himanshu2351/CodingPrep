package top150InterviewQuestions;

//Problem statement :
//
//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//
//The tests are generated such that there is exactly one solution. You may not use the same element twice.
//
//Your solution must use only constant extra space.
//
//Example 1:
//
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
		
public class TwoSum2WithSortedInput {
	public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length-1;
        int[] ans = new int[2];
        while(s<e){
            if(numbers[s]+numbers[e] == target){
                ans[0] = s+1;
                ans[1] = e+1;
                break;
            }
            else if(numbers[s]+numbers[e]<target){
                s++;
            }
            else{
                e--;
            }

        }
        return ans;
    }
}
