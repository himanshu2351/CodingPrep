package top150InterviewQuestions;

//Problem Statement :
//
//Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.
//
//Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
//
//Example 1:
//
//Input: s = "1 + 1"
//Output: 2
//
//Constraints:
//
//1 <= s.length <= 3 * 105
//s consists of digits, '+', '-', '(', ')', and ' '.
//s represents a valid expression.
//'+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
//'-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).
//There will be no two consecutive operators in the input.
//Every number and running calculation will fit in a signed 32-bit integer.

import java.util.Stack;

public class BasicCalculator {
	
public int calculate(String s) {
        
        Stack<String> st = new Stack<>();
        if(s.indexOf('(')!=-1){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' ') continue;
                else if(s.charAt(i)==')'){
                    String ch = "";
                    StringBuilder sb = new StringBuilder();
                    while(!(ch=st.pop()).equals("(")){
                        sb.insert(0,""+ch);
                    }
                    st.push(""+calculate(sb.toString()));
                }
                else{
                    st.push(""+s.charAt(i));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        System.out.println(sb.toString());
        String x = s.indexOf('(')!=-1 ? sb.toString() : s;
        x = x.replaceAll("[-]{2}","+");
        int sum = 0;
        String num = "";
        int sign = 1;
        int z = x.length();
        for(int i=0;i<z;i++){
            if(x.charAt(i) == ' ') continue;
            if(Character.isDigit(x.charAt(i))){
                num += ""+x.charAt(i);
            }
            else{
                
                if(num.length()>0) sum += (sign * Integer.valueOf(num));
                num = "";
                if(x.charAt(i)=='+'){
                    sign = 1;
                }
                else{
                    sign = -1;
                }
            }
        }
        if(num.length()!=0){
            sum+= (sign * Integer.valueOf(num));
        }

        return sum;
    }
}
