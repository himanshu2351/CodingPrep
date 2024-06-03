package top150InterviewQuestions;

//Problem Statement :
//
//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//
//Implement the MinStack class:
//
//MinStack() initializes the stack object.
//void push(int val) pushes the element val onto the stack.
//void pop() removes the element on the top of the stack.
//int top() gets the top element of the stack.
//int getMin() retrieves the minimum element in the stack.
//You must implement a solution with O(1) time complexity for each function.
//
//Example 1:
//
//Input
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//Output
//[null,null,null,null,-3,null,0,-2]

import java.util.*;

public class MinStack {
	
	Stack<Integer> st;
    ArrayList<Integer> al;
    public MinStack() {
        st = new Stack<>();
        al = new ArrayList<>();
    }
    
    public void push(int val) {
        st.push(val);
        int min = 0;
        if(al.isEmpty()) min = val;
        else min = val > al.get(al.size()-1) ? al.get(al.size()-1) : val;
        al.add(min);
    }
    
    public void pop() {
        st.pop();
        al.remove(al.size()-1);
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return al.get(al.size()-1);
    }
    
}
