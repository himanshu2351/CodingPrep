package arrayQuestion;

//Problem statement :
//	
//Selection sort is one of the sorting algorithms that works by repeatedly finding the minimum element from the unsorted part of the array and putting it at the beginning of the unsorted region of the array.
//
//You are given an unsorted array consisting of N non-negative integers. Your task is to sort the array in non-decreasing order using the Selection Sort algorithm.

public class SelectionSort {
	
	public static void selectionSort(int arr[], int n) {
		// Write your code here.
		for(int i=0;i<n;i++){
			int min = i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min = j;
				}
			}
			int t = arr[min];
			arr[min] = arr[i];
			arr[i] = t;
		}
	}
}
