package linkedList;

import java.util.Stack;

//Problem Statement :
//
//You are given the head of a linked list with n nodes.
//For each node in the list, find the value of the next greater node. That is, for each node, find the value of the first node that is next to it and has a strictly larger value than it.
//Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next greater node, set answer[i] = 0.
//
//Example 1:
//
//Input: head = [2,1,5]
//Output: [5,5,0]

public class NextGreaterNodeInLinkedList {
	public int[] nextLargerNodes(LinkedListNode<Integer> head) {
        
        if(head.next==null){
            int[] ans = new int[1];
            return ans;
        }
        LinkedListNode<Integer> curr = head;
        int size = 0;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        int[] arr = new int[size];
        curr = head;
        int k=0;
        while(curr!=null){
            arr[k++] = curr.data;
            curr = curr.next;
        }
        curr = head.next;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int j=1;
        while(curr!=null){
            if(!st.isEmpty() && curr.data>arr[st.peek()]){
                while(!st.isEmpty() && arr[st.peek()]<curr.data){
                    int x = st.pop();
                    arr[x] = curr.data;
                }
                st.push(j++);
            }
            else{
                st.push(j++);
            }
            curr = curr.next;
        }

        while(!st.isEmpty()){
            arr[st.pop()] = 0;
        }

        return arr;
    }
}
