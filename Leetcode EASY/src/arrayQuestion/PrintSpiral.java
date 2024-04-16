package arrayQuestion;

//Problem statement :
//	
//For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
//
//a. First row(left to right)
//b. Last column(top to bottom)
//c. Last row(right to left)
//d. First column(bottom to top)
// Mind that every element will be printed only once.
// 
//Sample Input 1:
//1
//4 4 
//1 2 3 4 
//5 6 7 8 
//9 10 11 12 
//13 14 15 16
//
//Sample Output 1:
//1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 

public class PrintSpiral {
	
	public static void spiralPrint(int matrix[][]){
		//Your code goes here

		if(matrix.length <= 0) return;
		int n = matrix.length;
		int m = matrix[0].length;
		int top = 0;
		int bottom = matrix.length-1;
		int left = 0;
		int right = matrix[0].length-1;
		int t=0;
		while(top<=bottom && left<=right){
			for(int i=left;i<=right && t<n*m;i++){
				System.out.print(matrix[top][i]+" ");
				t++;
			}
			top++;
			for(int i=top;i<=bottom && t<n*m;i++){
				System.out.print(matrix[i][right]+" ");
				t++;
			}
			right--;
			for(int i=right;i>=left && t<n*m;i--){
				System.out.print(matrix[bottom][i]+" ");
				t++;
			}
			bottom--;
			for(int i=bottom;i>=top && t<n*m;i--){
				System.out.print(matrix[i][left]+" ");
				t++;
			}
			left++;
		}
	}
}
