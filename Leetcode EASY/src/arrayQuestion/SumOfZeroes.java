package arrayQuestion;

//Problem statement :
//	
//You are given a binary matrix (it contains only 0s and 1s) with dimensions ‘N * M’. You need to find and return the sum of coverages of all zeros of the given matrix.
//
//Coverage for a particular 0 is defined as the total number of ‘1s’ around it (i.e., immediate left, immediate right, immediate up, and immediate bottom positions). 
//
//Sample Input 1:
//1
//2 2 
//1 0
//0 1
//
//Sample Output 1:
//4

import java.util.ArrayList;

public class SumOfZeroes {
	
	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here.
		int n = mat.size();
		int m = mat.get(0).size();
		int count = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(mat.get(i).get(j) == 0){
					if(i>0){
						count += mat.get(i-1).get(j);
					}
					if(i<n-1){
						count += mat.get(i+1).get(j);
					}
					if(j>0){
						count += mat.get(i).get(j-1);
					}
					if(j<m-1){
						count += mat.get(i).get(j+1);
					}
				}
			}
		}
		return count;
	}
}
