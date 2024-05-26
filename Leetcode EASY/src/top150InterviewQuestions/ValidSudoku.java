package top150InterviewQuestions;

//Problem Statement :
//
//Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
//
//Each row must contain the digits 1-9 without repetition.
//Each column must contain the digits 1-9 without repetition.
//Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
//Note:
//
//A Sudoku board (partially filled) could be valid but is not necessarily solvable.
//Only the filled cells need to be validated according to the mentioned rules.
// 
//
//Example 1:
//
//Input: board = 
//[["5","3",".",".","7",".",".",".","."]
//,["6",".",".","1","9","5",".",".","."]
//,[".","9","8",".",".",".",".","6","."]
//,["8",".",".",".","6",".",".",".","3"]
//,["4",".",".","8",".","3",".",".","1"]
//,["7",".",".",".","2",".",".",".","6"]
//,[".","6",".",".",".",".","2","8","."]
//,[".",".",".","4","1","9",".",".","5"]
//,[".",".",".",".","8",".",".","7","9"]]
//		
//Output: true

import java.util.*;

public class ValidSudoku {
	
public boolean isValidSudoku(char[][] board) {
        
        Set<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                String str1 = board[i][j] +" on i = " + i;
                String str2 = board[i][j] +" on j = " + j;
                String str3 = board[i][j] +" on i = " + i/3 + " and j = "+j/3;
                if((set.contains(str1) || set.contains(str2) || set.contains(str3))){
                    return false;
                }
                else{
                    set.add(str1);
                    set.add(str2);
                    set.add(str3);
                }
            }
        }

        
        return true;
    }
}
