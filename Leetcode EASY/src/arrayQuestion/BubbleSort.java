package arrayQuestion;

//Problem statement :
//	
//Bubble Sort is one of the sorting algorithms that works by repeatedly swapping the adjacent elements of the array if they are not in sorted order.
//
//You are given an unsorted array consisting of N non-negative integers. Your task is to sort the array in non-decreasing order using the Bubble Sort algorithm.

public class BubbleSort {
	
	public static void bubbleSort(int[] arr, int n) {   
        // Write your code here.
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = t;
                }
            }
        }

    }
}
