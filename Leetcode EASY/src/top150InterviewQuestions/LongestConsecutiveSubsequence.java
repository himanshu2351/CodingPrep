package top150InterviewQuestions;

//Problem Statement :
//
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//
//You must write an algorithm that runs in O(n) time.
//
//Example 1:
//
//Input: nums = [100,4,200,1,3,2]
//Output: 4

import java.util.*;

public class LongestConsecutiveSubsequence {
	
	public int longestConsecutive(int[] nums) {
        int max = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int x : set){
            if(!set.contains(x-1)){
                int l = 0;
                while(set.contains(x+l)){
                    l++;
                }
                max = Math.max(max,l);
            }
        }
        return max;
    }
}
