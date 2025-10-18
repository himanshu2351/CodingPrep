/**
 * 1304. Find N Unique Integers Sum up to Zero
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 *
 * Example 1:
 * Input: n = 5
 * Output: [-7,-1,1,3,4]
 *
 * Example 2:
 * Input: n = 3
 * Output: [-1,0,1]
 *
 * Example 3:
 * Input: n = 1
 * Output: [0]
 */

class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];

        int k = 0,min=-1,max=1;
        if(n%2!=0){
            ans[k++] = 0;
        }

        while(k<ans.length){
            ans[k++]=min--;
            ans[k++]=max++;
        }

        return ans;
    }
}