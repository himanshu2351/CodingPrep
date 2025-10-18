/**
 * 204. Count Primes
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 *
 * Example 1:
 * Input: n = 10
 * Output: 4
 *
 * Example 2:
 * Input: n = 0
 * Output: 0
 *
 * Example 3:
 * Input: n = 1
 * Output: 0
 */

class Solution {
    public int countPrimes(int n) {
        int[] arr = new int[n];

        if(n<=2) return 0;
        arr[0]=arr[1]=-1;
        for(int i=0;i*i<n;i++){
            if(arr[i]==-1) continue;
            int curr = i;
            for(int j=i*i;j<n;j+=i) arr[j]=-1;
        }

        int ans = 0;
        for(int x : arr){
            if(x==0) ans++;
        }

        return ans;
    }
}