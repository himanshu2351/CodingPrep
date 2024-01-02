package arrayQuestion;

//Problem statement :
//	
//You are given ‘N’ integers in the form of an array ‘ARR’. Print the sorted array using the insertion sort.
//
//Note :
//No need to return anything. You should sort the array in-place.
//For example :
//Let ‘ARR’ be: [1, 4, 2]
//The sorted array will be: [1, 2, 4].

public class InsertionSort {
	
	public static void insertionSort(int n , int[] arr) {
		// Write your code here.
		for(int i=1;i<n;i++){
			int j= i-1;
			int val = arr[i];
			while(j>=0){
				if(val>=arr[j]){
					break;
				}
				arr[j+1] = arr[j--];
			}
			arr[j+1] = val;
		}
	}
}
