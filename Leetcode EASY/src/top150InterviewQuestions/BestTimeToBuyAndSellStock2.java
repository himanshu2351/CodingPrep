package top150InterviewQuestions;

//Problem Statement :
//
//You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//
//On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
//
//Find and return the maximum profit you can achieve.
//
// 
//
//Example 1:
//
//Input: prices = [7,1,5,3,6,4]
//Output: 7

public class BestTimeToBuyAndSellStock2 {
	
	public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            int diff1 = prices[i]-prices[i-1];
            int diff2 = prices[i]-min;
            profit = Math.max(profit, Math.max(profit+diff1, diff2));
            if(min>prices[i]) min = prices[i]; 
        }
        return profit;
    }
}
