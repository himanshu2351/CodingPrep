/*0069 - Sqrt(x)
 * 
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1



Time Complexity = O(n)
Space Complexity = O(1)
*/
public class SqrtOfX {
	public int mySqrt(int x) {
        if(x==1) return 1;
        
        int l = 0;
        int h = x;
        
        long m = l+(h-l)/2;
        
        while(l<h){
            if(m*m == x || (m*m<x && (m+1)*(m+1)>x)) return (int)m;
            else if(m*m>x && (m+1)*(m+1)>x) h=(int)m;
            else l=(int)m;
            m=(long)(l+(h-l)/2);
        }
        
        return 0;
    }
}
