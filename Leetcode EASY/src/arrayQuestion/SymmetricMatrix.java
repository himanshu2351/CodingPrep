package arrayQuestion;

//Problem statement :
//	
//You are given a square matrix, return true if the matrix is symmetric otherwise return false.
//
//A symmetric matrix is that matrix whose transpose is equal to the matrix itself.
//
//Sample Input 1 :
//1
//3
//1 2 3 2 4 5 3 5 8
//
//Sample Output 1 :
//Yes

public class SymmetricMatrix {
	
	public static boolean isMatrixSymmetric(int[][] matrix) {
        // Write your code here.

        int n = matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(matrix[i][j] != matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
