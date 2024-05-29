package dailyChallenge.leetcode;

//Problem Statement :
//
//Given a sorted integer array nums and an integer n, add/patch elements to the array such that any number in the range [1, n] inclusive can be formed by the sum of some elements in the array.
//
//Return the minimum number of patches required.
//
// 
//
//Example 1:
//
//Input: nums = [1,3], n = 6
//Output: 1

public class PatchingArray {
	
public int minPatches(int[] nums, int n) {
        
        int reach = 0;
        int min = 1;
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            if(reach>=n) break;
            if(nums[i]<=min){
                reach = reach+nums[i];
                min = reach+1;
            }
            else{
                for(int j=min;j<nums[i];j++){
                    if(reach>=n) break;
                    if(reach>=j) continue;
                    count+=1;
                    reach = reach+j;
                }
                min = nums[i--];
            }

        }

        while(reach<n && reach>0){
            count+=1;
            reach+=min;
            min=reach+1;
        }
        return count;
    }
}
