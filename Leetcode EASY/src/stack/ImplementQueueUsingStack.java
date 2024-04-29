package stack;

import java.util.Stack;

//Problem Statement :
//
//Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
//
//Implement the MyQueue class:
//
//void push(int x) Pushes element x to the back of the queue.
//int pop() Removes the element from the front of the queue and returns it.
//int peek() Returns the element at the front of the queue.
//boolean empty() Returns true if the queue is empty, false otherwise.
//Notes:
//You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
//Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
// 
//Example 1:
//
//Input
//["MyQueue", "push", "push", "peek", "pop", "empty"]
//[[], [1], [2], [], [], []]
//Output
//[null, null, null, 1, 1, false]

public class ImplementQueueUsingStack {
	Stack<Integer> st = null;
    int size;
    public ImplementQueueUsingStack() {
        st = new Stack<>();
        size = 0;
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        return st.get(size++);
    }
    
    public int peek() {
         return st.get(size);
    }
    
    public boolean empty() {
        if(size==st.size()) return true;
        return false;
    }
}
