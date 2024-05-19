package top150InterviewQuestions;

//Problem Statement :
//	
//According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
//
//The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
//
//Any live cell with fewer than two live neighbors dies as if caused by under-population.
//Any live cell with two or three live neighbors lives on to the next generation.
//Any live cell with more than three live neighbors dies, as if by over-population.
//Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
//The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.
//
//Example 1:
//
//Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
//Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]

public class GameOfLife {
	
	int[] r = {-1,-1,-1,0,0,1,1,1};
    int[] c = {-1,0,1,-1,1,-1,0,1};
    public void gameOfLife(int[][] board) {
        
        int n = board.length;
        int m = board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int curr = board[i][j];
                int live = 0;
                for(int k=0;k<8;k++){
                    if(i+r[k]>=0  && i+r[k]<n && j+c[k]>=0 && j+c[k]<m){
                        if(board[i+r[k]][j+c[k]] == 1 || board[i+r[k]][j+c[k]] == -1) live++; 
                    }
                }
                if(curr==0){
                    if(live == 3) board[i][j] = 2;
                }
                else{
                    if(live < 2 || live > 3) board[i][j] = -1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j] = board[i][j] == 2 ? 1 : board[i][j];
                board[i][j] = board[i][j] == -1 ? 0 : board[i][j];
            }
        }
    }
}
