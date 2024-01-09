package stringQuestion;

//Problem statement :
//	
//You are given a number 'N' in the form of a string 'S', your task is to find the smallest number strictly greater than the given number 'N' which is a palindrome.
//
//Note:
//
//1) A palindrome is a word, number, phrase, or another sequence of characters that reads the same backward as forward, such as 'naman', 'abcba', '1234321', etc
//2) The numerical value of the given string 'S' will be greater than 0.
//3) A single-digit number is also considered as a palindrome.
//4) Note that the length of the string 'S' is nothing but the number of digits in the number 'N'.
//
//Sample Input 1:
//3
//3
//121
//4
//1221
//4
//5223
//
//Sample Output 1:
//131
//1331
//5225

public class NextSmallestPalindrome {

	public static String nextLargestPalindrome(String number, int length) {
		// Write your code here.
		if(length==1){
			if(number=="9") return "11";
			else{
				return String.valueOf(Integer.valueOf(number)+1);
			} 
		}
		boolean allNine = true;
		for(int i=0;i<length;i++){
			if(number.charAt(i)!='9'){
				allNine = false;
				break;
			}
		}

		if(allNine){
			return String.valueOf(Integer.valueOf(number)+2);
		}

		StringBuilder sb = new StringBuilder();
		int n = length%2 == 0 ? length/2 : (length/2)+1;
		int m = length%2 == 0 ? n-1 : n-2;
		boolean val = false;
		for(int i=m,j=n;i>=0 && j<length;i--,j++){
			if(Integer.valueOf(number.charAt(i))>Integer.valueOf(number.charAt(j))){
				val = true;
				break;
			}
			else if(Integer.valueOf(number.charAt(i))<Integer.valueOf(number.charAt(j))){
				break;
			}
		} 

		if(val){
			String x = number.substring(0,n);
			sb.append(x);
			n = number.length()%2 == 0 ? x.length()-1 : x.length()-2;
			for(int j=n;j>=0;j--){
				sb.append(""+x.charAt(j));
			}
		}
		else{
			String x = number.substring(0,n);
			sb.append(x);
			int carry = 1;
			for(int i=x.length()-1;i>=0;i--){
				int a = (Integer.valueOf(""+x.charAt(i))+carry) % 10;
				carry = (Integer.valueOf(""+x.charAt(i))+carry) / 10;
				sb.replace(i, i+1, String.valueOf(a));
			}
			n = number.length()%2 == 0 ? x.length()-1 : x.length()-2;
			for(int i=n;i>=0;i--){
				sb.append(""+sb.charAt(i));
			}
		}
		return sb.toString();
	} 
}
