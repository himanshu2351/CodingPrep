package stack;

import java.util.Stack;

//Problem Statement :
//
//Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
//substring.
//
//Example 1:
//
//Input: s = "(()"
//Output: 2

public class LongestValidParantheses {
	public int longestValidParentheses(String s) {
        int max = 0;
        if(s.length()==0 || s.length()==1) return max;

        Stack<Integer> st = new Stack<>();
        int x = 0;
        // st.add(s.charAt(0));
        for(int i=0;i<s.length();i++){
            if(st.isEmpty() && s.charAt(i)==')'){
                x=0;
            }
            else{
                if(s.charAt(i)=='('){
                    st.push(x);
                    x = 0;
                }
                else if(s.charAt(i)==')'){
                    int y = st.pop();
                    x = x+2+y;
                }
            }
            if(max<x) max = x;
        }
        return max;
    }
}
