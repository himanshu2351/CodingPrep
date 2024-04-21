package linkedList;

//Problem Statement :
//
//Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
//
//k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
//
//You may not alter the values in the list's nodes, only nodes themselves may be changed.
//
//Example 1:
//
//Input: head = [1,2,3,4,5], k = 2
//Output: [2,1,4,3,5]

public class ReverseNodesInGroupOfK {
	public LinkedListNode<Integer> reverseKGroup(LinkedListNode<Integer> head, int k) {
        if(head == null || k==1) return head;

        int size = 0;
        LinkedListNode<Integer> curr = head;
        while(curr!=null){
            curr = curr.next;
            size++;
        }
        if(k>size) return head;

        int n = k;
        LinkedListNode<Integer> send = head;
        LinkedListNode<Integer> prev = null;
        while(n-->0){
            prev = send;
            send = send.next;
        }

        send = reverseKGroup(send,k);
        prev.next = send;
        n = k;
        curr = head.next;
        LinkedListNode<Integer> nextCurr = null;
        LinkedListNode<Integer> pos = head;
        while(n-->1){
            nextCurr = curr.next;
            curr.next = head;
            head = curr;
            pos.next = nextCurr;
            curr = nextCurr;
        }

        return head;

    }
}
