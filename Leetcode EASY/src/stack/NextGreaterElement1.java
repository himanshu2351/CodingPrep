package stack;

import java.util.*;

//Problem Statement :
//
//The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
//
//You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
//
//For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
//
//Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
//
//Example 1:
//
//Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
//Output: [-1,3,-1]


public class NextGreaterElement1 {
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> help = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=nums2.length-1;i>=0;i--){
            int x = nums2[i];
            while(st.peek()!=-1 && st.peek()<x){
                st.pop();
            }
            help.put(x,st.peek());
            st.push(x);
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i] = help.get(nums1[i]);
        }
        
        return nums1;
    }
}
