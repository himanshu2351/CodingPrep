package dailyChallenge.leetcode;

//Problem Statement
//
//Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
//
//Example 1:
//
//Input: c = 5
//Output: true
//Explanation: 1 * 1 + 2 * 2 = 5
//Example 2:
//
//Input: c = 3
//Output: false

public class SumOfSquareNumbers {
	
	public boolean judgeSquareSum(int c) {
        
        int sq = (int)Math.sqrt(c);
        int i=0;
        int j=sq;

        while(i<=j){
            long sum = (long)(Math.pow(i,2)+Math.pow(j,2));
            if(sum == (long)c){
                return true;
            }
            else if(sum<(long)c){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}
