package stack;

import java.util.Stack;

//Problem Statement :
//
//You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
//
//You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
//
//An integer x.
//Record a new score of x.
//'+'.
//Record a new score that is the sum of the previous two scores.
//'D'.
//Record a new score that is the double of the previous score.
//'C'.
//Invalidate the previous score, removing it from the record.
//Return the sum of all the scores on the record after applying all the operations.
//
//The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
//
//Example 1:
//
//Input: ops = ["5","2","C","D","+"]
//Output: 30

public class BaseballGame {
public int calPoints(String[] operations) {
        
        Stack<Integer> st = new Stack<>();
        for(String x : operations){
            if(x.equals("C")){
                st.pop();
            }
            else if(x.equals("D")){
                st.push(st.peek()*2);
            }
            else if(x.equals("+")){
                int i = st.pop();
                int j = st.peek()+i;
                st.push(i);
                st.push(j);
            }
            else{
                st.push(Integer.valueOf(x));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}
