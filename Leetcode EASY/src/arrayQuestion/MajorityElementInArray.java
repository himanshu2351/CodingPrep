package arrayQuestion;

//Problem statement :
//	
//You have been given an array/list 'ARR' consisting of 'N' integers. Your task is to find the majority element in the array. If there is no majority element present, print -1.
//
//Note:
//A majority element is an element that occurs more than floor('N' / 2) times in the array.
//
//Sample Input 1:
//2
//5
//2 3 9 2 2
//4
//8 5 1 9 
//
//Sample Output 1:
//2
//-1

public class MajorityElementInArray {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.

		int num = -1;
		int count = 0;

		for(int i : arr){
			if(count == 0){
				num = i;
				count = 1;
				continue;
			}

			if(i == num) count++;
			else count--;
		}

		count = 0;
		for(int i : arr){
			if(i == num) count++;
		}

		return count>Math.floor(n/2) ? num : -1;
	}
}
