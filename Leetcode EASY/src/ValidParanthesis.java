import java.util.Stack;

//0020 - Valid Paranthesis

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
// 
//
//Example 1:
//
//Input: s = "()"
//Output: true
//Example 2:
//
//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false
// 
//
//Constraints:
//
//1 <= s.length <= 104
//s consists of parentheses only '()[]{}'.

//Time Complexity - O(n)
//Space Complexity - O(n)

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValidParanthesis obj = new ValidParanthesis();
		
		String input = "({}[{})";
		
		boolean answer = obj.isValid(input);
		
		System.out.println(answer);
		
		
	}
	
	public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(')');
            }
            else if(c == '{'){
                st.push('}');
            }
            else if(c == '['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }

}
