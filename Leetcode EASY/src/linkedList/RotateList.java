package linkedList;

//Problem Statement :
//	
//Given the head of a linked list, rotate the list to the right by k places.
//
//Example 1:
//
//Input: head = [1,2,3,4,5], k = 2
//Output: [4,5,1,2,3]

public class RotateList {
	public LinkedListNode<Integer> rotateRight(LinkedListNode<Integer> head, int k) {

        if(head == null || head.next == null || k==0){
            return head;
        }

        int size = 0;
        LinkedListNode<Integer> curr = head;
        while(curr!=null){
            size++;
            curr = curr.next;
        }

        k = k%size;

        if(k==0){
            return head;
        }

        int n = size-k;
        curr = head;
        LinkedListNode<Integer> prev = null;
        while(n-->0){
            prev = curr;
            curr = curr.next;
        }
        if(prev!=null) prev.next = null;
        LinkedListNode<Integer> currLast = curr;

        while(currLast.next!= null){
            currLast = currLast.next;
        }

        currLast.next = head;

        return curr;
    }
}
