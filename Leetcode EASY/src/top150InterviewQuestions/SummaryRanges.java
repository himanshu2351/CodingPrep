package top150InterviewQuestions;

//Problem Statement :
//
//You are given a sorted unique integer array nums.
//
//A range [a,b] is the set of all integers from a to b (inclusive).
//
//Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
//
//Each range [a,b] in the list should be output as:
//
//"a->b" if a != b
//"a" if a == b
// 
//Example 1:
//
//Input: nums = [0,1,2,4,5,7]
//Output: ["0->2","4->5","7"]
		
import java.util.*;

public class SummaryRanges {
	
	public List<String> summaryRanges(int[] nums) {
        List<String> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            StringBuilder sb = new StringBuilder();
            while(j<nums.length && nums[j]==nums[j-1]+1){
                j++;
            }
            if(nums[i]==nums[j-1]){
                sb.append(""+nums[i]);
            }
            else{
                sb.append(""+nums[i]).append("->").append(""+nums[j-1]);
            }
            al.add(sb.toString());
            i=j-1;
        }
        return al;
    }
}
