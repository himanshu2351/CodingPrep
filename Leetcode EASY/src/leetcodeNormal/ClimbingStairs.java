package leetcodeNormal;
//0070 - Climbing Stairs

//You are climbing a staircase. It takes n steps to reach the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
// 
//
//Example 1:
//
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//Example 2:
//
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
// 
//
//Constraints:
//
//1 <= n <= 45
//
//Time Complexity - O(n)
//Space Complexity - O(1)

public class ClimbingStairs {
	public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        // return climbStairs(n-1)+climbStairs(n-2);
        int x = 1;
        int y = 2;
        int ans = 0;
        for(int i=2;i<n;i++){
            ans = x+y;
            x=y;
            y=ans;
        }
        return ans;
    }
}
