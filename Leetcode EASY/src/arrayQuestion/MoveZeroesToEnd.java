package arrayQuestion;

import java.util.ArrayList;

//Problem statement :
//	
//Given an unsorted array of integers, you have to move the array elements in a way such that all the zeroes are transferred to the end, and all the non-zero elements are moved to the front. The non-zero elements must be ordered in their order of appearance.
//
//For example: 
//	
//the input array is: [0, 1, -2, 3, 4, 0, 5, -27, 9, 0], 
//then the output array must be:[1, -2, 3, 4, 5, -27, 9, 0, 0, 0].
//
//Expected Complexity: Try doing it in O(n) time complexity and O(1) space complexity. Here, ‘n’ is the size of the array.

public class MoveZeroesToEnd {
	public static void pushZerosAtEnd(ArrayList<Integer> arr)
	{
		// Write your code here.
		int pos = -1;
		int i=0;
		while(i<arr.size()){
			if(arr.get(i)==0){
				if(pos == -1) pos = i;
			}
			else{
				if(pos!=-1){
					arr.set(pos++, arr.get(i));
					arr.set(i, 0);
				}
			}
			i++;
		}
	}
}
