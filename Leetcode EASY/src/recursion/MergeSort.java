package recursion;

//Problem statement :
//	
//Given a sequence of numbers ‘ARR’. Your task is to return a sorted sequence of ‘ARR’ in non-descending order with help of the merge sort algorithm.
//
//Example :
//
//Merge Sort Algorithm -
//
//Merge sort is a Divide and Conquer based Algorithm. It divides the input array into two-parts, until the size of the input array is not ‘1’. In the return part, it will merge two sorted arrays a return a whole merged sorted array.
		

public class MergeSort {
	
	public static void mergeSort(int[] arr, int n) {
		// Write your code here.

		if(arr.length==1) return;
		int p=n/2;
		int q = arr.length-p;
		int[] l = new int[p];
		int[] r = new int[q];

		for(int i=0;i<p;i++){
			l[i] = arr[i];
		}
		for(int i=p;i<n;i++){
			r[i-p] = arr[i];
		}

		mergeSort(l, p);
		mergeSort(r, q);

		int i=0,j=0,k=0;
		while(i<p || j<q){
			if(i==p){
				arr[k++] = r[j++];
			}
			else if(j==q){
				arr[k++] = l[i++];
			}
			else{
				if(l[i]>r[j]){
					arr[k++] = r[j++];
				}
				else{
					arr[k++] = l[i++];
				}
			}
		}

		return;
	}
}
