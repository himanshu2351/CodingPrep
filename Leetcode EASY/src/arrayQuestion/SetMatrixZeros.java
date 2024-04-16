package arrayQuestion;

import java.util.* ;

//Problem statement :
//	
//Given an ‘N’ x ‘M’ integer matrix, if an element is 0, set its entire row and column to 0's, and return the matrix. In particular, your task is to modify it in such a way that if a cell has a value 0 (matrix[i][j] == 0), then all the cells of the ith row and jth column should be changed to 0.
//
//You must do it in place.
//
//For Example:
//
//If the given grid is this:
//[7, 19, 3]
//[4, 21, 0]
//
//Then the modified grid will be:
//[7, 19, 0]
//[0, 0,  0]

public class SetMatrixZeros {
	
	public static void setZeros(int matrix[][]) {
        // Write your code here..
		
//      ============= Solution 1 ================
		
        boolean firstRowZero = false, firstColZero = false;

        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }

        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i] == 0){
                firstRowZero = true;
                break;
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j]=0;
                }
            }
        }

        if(firstRowZero){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i] = 0;
            }
        }

        if(firstColZero){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }
        
//        ============= Solution 2 ================
        
        // Set<Integer> r= new HashSet<>();
        // Set<Integer> c= new HashSet<>();

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==0){
        //             r.add(i);
        //             c.add(j);
        //         }
        //     }
        // }

        // for(int i : r){
        //     for(int j=0;j<matrix[0].length;j++){
        //         matrix[i][j] = 0;
        //     }
        // }

        // for(int i : c){
        //     for(int j=0;j<matrix.length;j++){
        //         matrix[j][i] = 0;
        //     }
        // }

    }
}
