package recursion;

import java.util.*;

//Problem statement :
//	
//You are given an array of integers. You need to sort the array in ascending order using quick sort.
//
//Quick sort is a divide and conquer algorithm in which we choose a pivot point and partition the array into two parts i.e, left and right. The left part contains the numbers smaller than the pivot element and the right part contains the numbers larger than the pivot element. Then we recursively sort the left and right parts of the array.
//
//Sample Input 1:
//2
//5
//4 2 5 1 3
//4     
//6 2 4 1
//
//Sample Output 1:
//1 2 3 4 5
//1 2 4 6

public class QuickSort {
	
	public static List<Integer> quickSort(List<Integer> arr){
        // Write your code here.
        quick(arr,0,arr.size()-1);

        return arr;
    }

    public static void quick(List<Integer> arr, int l,int r){

        if(l>=r) return;
        
        int p = arr.get(r);

        int i=l,j=l;

        while(i<=r){
            if(arr.get(i)<=p){
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                j++;
            }
            i++;
        }
        quick(arr,l,j-2);
        quick(arr,j,r);
    }
}
