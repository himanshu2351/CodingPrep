package top150InterviewQuestions;

//Problem Statement :
//
//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
//Example 1:
//
//Input: nums = [1,2,3,1], k = 3
//Output: true

import java.util.HashMap;

public class ContainsDuplicate2 {
	
public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                if(Math.abs(h.get(nums[i])-i)<=k){
                    return true;
                }
                else{
                    h.put(nums[i],i);
                }
            }
            else{
                h.put(nums[i],i);
            }
        }
        return false;
    }
}
