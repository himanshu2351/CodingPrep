package arrayQuestion;

//Problem statement:
//	
//You have been given an array/list 'ARR' of integers. Your task is to find the second largest element present in the 'ARR'.
//
//Note:
//a) Duplicate elements may be present.
//
//b) If no such element is present return -1.
//		
//Example:
//	
//Input: Given a sequence of five numbers 2, 4, 5, 6, 8.
//
//Output:  6

public class SecondHighestNumberInArray {

	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int highNum = arr[0];
		int secHighNum = Integer.MIN_VALUE;
		for(int x : arr){
			if(x>highNum){
				secHighNum = highNum;
				highNum = x;
			} 
			if(x>secHighNum && x<highNum){
				secHighNum = x;
			}
		}
		if(secHighNum == Integer.MIN_VALUE) secHighNum = -1;
		return secHighNum;
	}
}
