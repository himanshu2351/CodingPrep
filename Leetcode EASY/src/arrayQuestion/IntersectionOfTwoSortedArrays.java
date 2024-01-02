package arrayQuestion;

//Problem statement :
//	
//You are given two arrays 'A' and 'B' of size 'N' and 'M' respectively. Both these arrays are sorted in non-decreasing order. You have to find the intersection of these two arrays.
//
//Intersection of two arrays is an array that consists of all the common elements occurring in both arrays.
//
//Note :
//1. The length of each array is greater than zero.
//2. Both the arrays are sorted in non-decreasing order.
//3. The output should be in the order of elements that occur in the original arrays.
//4. If there is no intersection present then return an empty array.
//		
//Sample Input 1 :
//2
//6 4
//1 2 2 2 3 4
//2 2 3 3
//3 2
//1 2 3
//3 4  
//
//Sample Output 1 :
//2 2 3
//3   

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		ArrayList<Integer> al = new ArrayList<>();
		int i=0,j=0;
		while(i<n && j<m){
			if(arr1.get(i)<arr2.get(j)){
				i++;
			}
			else if(arr1.get(i)>arr2.get(j)){
				j++;
			}
			else{
				
				int c1 = 0, c2 = 0;
				while(i+c1<n && arr1.get(i+c1)==arr1.get(i)){
					c1++;
				}
				while( j+c2<m && arr2.get(j+c2)==arr2.get(j)){
					c2++;
				}
				for(int x=0;x<Math.min(c1, c2);x++){
					al.add(arr1.get(i));
				}
				i=i+c1;
				j=j+c2;
			}
		}

		return al;

		
	}
}
