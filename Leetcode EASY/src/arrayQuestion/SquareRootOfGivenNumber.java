package arrayQuestion;

//Problem statement :
//	
//You are given a positive integer ‘n’.
//Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of sqrt(n).
//
//Example:
//	
//Input: ‘n’ = 7
//
//Output: 2
//
//Explanation:
//The square root of the number 7 lies between 2 and 3, so the floor value is 2.

public class SquareRootOfGivenNumber {
	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		 long s = 0L;
		 long e = N;
		 int ans = 0;
		 while(s<=e){
			 long mid = s+((e-s)/2);
			 long x = mid*mid;
			 if(x<N){
				ans = (int)mid;
				s = mid+1;
			 }
			 else if(x>N){
				 e = mid-1;
			 }
			 else{
				 return (int)mid;
			 }
		 }
		 return ans;
		 
	}
}
