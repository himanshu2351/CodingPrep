package top150InterviewQuestions;

//Problem Statement :
//
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.
//
//Example 1:
//
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]

import java.util.*;

public class ThreeSum {
	
	public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> al = new HashSet<>();
        Arrays.sort(nums);
        int prev = -1;
        for(int i=0;i<nums.length-2;i++){
            if(prev!=-1 && nums[i]==nums[prev]) continue;
            prev = i;
            int s = i+1;
            int e = nums.length-1;
            while(s<e){
                if(nums[i]+nums[s]+nums[e]==0){
                    al.add(Arrays.asList(nums[i],nums[s],nums[e]));
                    s++;
                    e--;
                }
                else if(nums[i]+nums[s]+nums[e]<0){
                    s++;
                }
                else{
                    e--;
                }
            }
        }

        return new ArrayList<>(al);
    }
}
