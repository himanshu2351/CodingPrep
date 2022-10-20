/*0118 - Pascal's Triangle

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30



Time Complexity - O(n^2)
Space Complexity - O(n^2)
*/


import java.util.*;


public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> al = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    al.add(1);
                }
                else{
                    List<Integer> row = result.get(i-1);
                    al.add(row.get(j-1)+row.get(j));
                }
            }
            result.add(al);
        }
        return result;
    }
}
