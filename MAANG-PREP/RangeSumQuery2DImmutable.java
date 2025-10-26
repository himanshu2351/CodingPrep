/**
 * 304. Range Sum Query 2D - Immutable
 *
 * Given a 2D matrix matrix, handle multiple queries of the following type:
 *
 * Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 * Implement the NumMatrix class:
 *
 * NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
 * int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
 * You must design an algorithm where sumRegion works on O(1) time complexity.
 *
 * Input
 * ["NumMatrix", "sumRegion", "sumRegion", "sumRegion"]
 * [[[[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]], [2, 1, 4, 3], [1, 1, 2, 2], [1, 2, 2, 4]]
 * Output
 * [null, 8, 11, 12]
 */

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

class NumMatrix {

    int[][] prefixSum;

    public NumMatrix(int[][] matrix) {
        prefixSum = new int[matrix.length+1][matrix[0].length+1];
        for(int i=1;i<=matrix.length;i++){
            int sum = 0;
            for(int j=1;j<=matrix[0].length;j++){
                prefixSum[i][j] = matrix[i-1][j-1] + prefixSum[i-1][j] + prefixSum[i][j-1] - prefixSum[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; row2++; col1++; col2++;
        int ans = prefixSum[row2][col2] - prefixSum[row1-1][col2] - prefixSum[row2][col1-1] + prefixSum[row1-1][col1-1];

        return ans;
    }
}