/**
349. Intersection of Two Arrays
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st = new HashSet<>();
        Set<Integer> hm = new HashSet<>();

        for(int x : nums1){
            hm.add(x);
        }

        for(int x : nums2){
            if(hm.contains(x)){
                st.add(x);
            }
        }

        int[] arr = new int[st.size()];
        int k=0;
        for(int x : st){
            arr[k++] = x;
        }

        return arr;
    }
}