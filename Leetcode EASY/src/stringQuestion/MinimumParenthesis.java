package stringQuestion;

//Problem statement :
//	
//Given a string "pattern", which contains only two types of characters ‘(’, ‘)’.
//
//Your task is to find the minimum number of parentheses either ‘(’, ‘)’ we must add the parentheses in string ‘pattern’ and the resulted string is valid.
//
//Condition for valid string-
//
//Every opening parenthesis ‘(’ must have a correct closing parenthesis ‘)’.
//
//Example - ‘(()(()))’, ‘()()()’, ‘((()))’ are valid string, and ‘(((’, ‘(()’, ‘)(())’ are invalid string.
//
//Note:
//1. You are not required to print the output explicitly, it has already been taken care of. Just implement the function and return the minimum number of parentheses required to make a string valid.
//
//Sample Input 1:
//2
//)((()
//((
//		
//Sample Output 1:
//3
//2

public class MinimumParenthesis {
	public static int minimumParentheses(String pattern) {
		// Write your code here.
		int open = 0, close = 0;

		for(int i=0;i<pattern.length();i++){
			char ch = pattern.charAt(i);
			if(ch ==')'){
				if(open <= 0){
					close++;
				}
				else{
					open--;
				}
			}
			else{
				open++;
			}
		}

		return open+close;
	}
}
