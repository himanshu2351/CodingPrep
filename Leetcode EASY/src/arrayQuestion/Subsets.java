package arrayQuestion;

import java.util.*;

//Problem Statement :
//
//Given an integer array nums of unique elements, return all possible 
//subsets
// (the power set).
//
//The solution set must not contain duplicate subsets. Return the solution in any order.
//
//Example 1:
//
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        // List<Integer> al1 = new ArrayList<>();
        // al.add(al1);
        // if(nums.length==0) return al;

        // for(int i=0;i<nums.length;i++){
        //     int s = al.size();
        //     for(int j=0;j<s;j++){
        //         List<Integer> li = al.get(j);
        //         List a = new ArrayList<>();
        //         a.addAll(li);
        //         a.add(nums[i]);
        //         al.add(a);
        //     }
        // }

        subset(nums,new ArrayList<Integer>(),al,0);
        return al;
    }

    public void subset(int[] nums, List<Integer> al1, List<List<Integer>> al, int index){

        if(index>=nums.length){
            al.add(new ArrayList<>(al1));
            return;
        }

        al1.add(nums[index]);
        subset(nums,al1,al,index+1);
        al1.remove(al1.size()-1);
        subset(nums,al1,al,index+1);
    }
}
