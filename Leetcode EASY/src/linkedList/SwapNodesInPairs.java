package linkedList;

//Problem Statement :
//
////Given a linked list, swap every two adjacent nodes and return 
//its head. You must solve the problem without modifying the values
//in the list's nodes (i.e., only nodes themselves may be changed.)
//
//Input: head = [1,2,3,4]
//Output: [2,1,4,3]

public class SwapNodesInPairs {
	public LinkedListNode<Integer> swapPairs(LinkedListNode<Integer> head) {
        if(head == null || head.next == null) return head;

        LinkedListNode<Integer> li = swapPairs(head.next.next);

        LinkedListNode<Integer> temp = head.next;
        head.next = li;
        temp.next = head;

        return temp;
    }
}
