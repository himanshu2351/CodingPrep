//0066 - Plus One
//
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//Increment the large integer by one and return the resulting array of digits.
//
// 
//
//Example 1:
//
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//Example 3:
//
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].

//Time Complexity - O(n)
//Space Complexity - O(1)

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test1 = new int[] {9,9};
		
		int[] result1 = plusOne(test1);
		
		for(int item : result1) {
			System.out.println(item);
		}

	}
	
	public static int[] plusOne(int[] digits) {
	        
	        int x = digits[digits.length-1];
	        int carry = 1;
	        for(int i=digits.length-1;i>=0;i--){
	            int num = digits[i] + carry;
	            if(num<=9){
	                digits[i] = num;
	                carry = 0;
	            }
	            else{
	                digits[i]=0;
	                carry = 1;
	            }
	        }
	        
	        int[] ans = new int[digits.length+1];
	        
	        if(carry == 0){
	            return digits;
	        }
	        else{
	            ans[0] = 1;
	            for(int i=digits.length-1;i>=0;i--){
	                ans[i+1] = digits[i];
	            }
	        }
	        
	        return ans;
	        
	    }

}
