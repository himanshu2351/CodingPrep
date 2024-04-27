package linkedList;

//Problem Statement :
//
//You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.
//
//Return the head of the linked list after doubling it.
//
//Example 1:
//
//Input: head = [1,8,9]
//Output: [3,7,8]


public class DoubleTheNumberRepresentedByLinkedList {
	
	public LinkedListNode<Integer> doubleIt(LinkedListNode<Integer> head) {
        
        int c = 0;
        LinkedListNode<Integer> curr = head;

        if(curr!=null && curr.data>4){
            c = 1;
        }

        while(curr!=null && curr.next != null){
            int v = curr.data;
            if(curr.next.data > 4){
                curr.data = (2*v+1)%10;
            }
            else{
                curr.data = (2*v)%10;
            }
            curr = curr.next;
        }
        if(curr!=null){
            curr.data = (curr.data*2)%10;
        }
        if(c==1){
            LinkedListNode<Integer> h = new LinkedListNode<Integer>(1,head);
            return h;
        }
        return head;
    }
}
