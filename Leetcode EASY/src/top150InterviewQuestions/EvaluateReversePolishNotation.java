package top150InterviewQuestions;

//Problem Statement :
//
//You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
//
//Evaluate the expression. Return an integer that represents the value of the expression.
//
//Note that:
//
//The valid operators are '+', '-', '*', and '/'.
//Each operand may be an integer or another expression.
//The division between two integers always truncates toward zero.
//There will not be any division by zero.
//The input represents a valid arithmetic expression in a reverse polish notation.
//The answer and all the intermediate calculations can be represented in a 32-bit integer.
// 
//Example 1:
//
//Input: tokens = ["2","1","+","3","*"]
//Output: 9

import java.util.*;

public class EvaluateReversePolishNotation {
	
	public int evalRPN(String[] tokens) {
        ArrayList<String> al = new ArrayList<>();
        al.add("+");
        al.add("-");
        al.add("*");
        al.add("/");
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(al.contains(tokens[i])){
                int y = Integer.valueOf(st.pop());
                int x = Integer.valueOf(st.pop());
                int m = 0;
                switch(tokens[i]){
                    case "+":
                        m = x+y;
                        break;
                    
                    case "-":
                        m = x-y;
                        break;

                    case "*":
                        m = x*y;
                        break;

                    case "/":
                        m = x/y;
                        break;
                }
                st.push(m);
            }
            else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        return st.pop();
    }
}
