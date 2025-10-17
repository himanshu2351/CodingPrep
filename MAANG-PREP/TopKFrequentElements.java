/**
Top K Frequent Elements

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:

Input: nums = [1], k = 1
Output: [1]

Example 3:

Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
Output: [1,2]
*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];

        HashMap<Integer, HashSet<Integer>> setMap = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0, idx = 0;

        for(int x : nums){
            map.put(x, map.getOrDefault(x,0)+1);
            int y = map.get(x);

            if(y>1){
                setMap.get(y-1).remove(x);
            }
            if(y>setMap.size()){
                setMap.put(y, new HashSet<Integer>());
                max = y;
            }
            setMap.get(y).add(x);
        }

        while(max>0 && idx<k){
            for(int x : setMap.get(max)){
                if(idx<k) arr[idx++] = x;

            }
            max--;
        }

        return arr;
    }
}