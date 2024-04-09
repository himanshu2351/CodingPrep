package arrayQuestion;

//Problem statement :
//	
//You are given an array 'ARR' of integers of length N. Your task is to find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can have negative numbers as well.
//
//For example, the input [3, 4, -1, 1] should give output 2 because it is the smallest positive number that is missing in the input array.
//
//Sample Input 1 :
//1
//5
//3 2 -6 1 0
//
//Sample Output 1:
//4

public class FirstMissingPositive {
	
	public static int firstMissing(int[] arr, int n) {
		// Write your code here.	

		boolean checkOne = false;
		for(int x : arr){
			if(x == 1) {
				checkOne = true;
				break;
			}
		}
		if(!checkOne) return 1;

		for(int i=0;i<n;i++){
			if(arr[i]<1 || arr[i]>n){
				arr[i] = 1;
			}
		}

		for(int i=0;i<n;i++){
			int x = Math.abs(arr[i]);
			if(x>0 && x<n+1){
				arr[x-1] = -Math.abs(arr[x-1]);
			}
		}

		for(int i=0;i<n;i++){
			if(arr[i]>=0) return i+1;
		}	
		return n+1;
	}
}
