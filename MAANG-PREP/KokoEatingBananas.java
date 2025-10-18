/**
 * 875. Koko Eating Bananas
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 *
 * Example 1:
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4
 *
 * Example 2:
 * Input: piles = [30,11,23,4,20], h = 5
 * Output: 30
 *
 * Example 3:
 * Input: piles = [30,11,23,4,20], h = 6
 * Output: 23
 */

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1, max = Integer.MIN_VALUE;

        for(int x : piles){
            max = Math.max(x, max);
        }
        int ans = 0, mid = 0;
        while(min<=max){
            mid = min + (max-min)/2;

            if(canFinish(piles, h, mid)){
                ans = mid;
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }

        return ans;
    }

    public boolean canFinish(int[] piles, int h, int k){

        int time = 0, i=0;
        for(int pile : piles){
            time += (pile+k-1)/k;
            if(time>h) return false;
        }

        return time<=h;
    }
}