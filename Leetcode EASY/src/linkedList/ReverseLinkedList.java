package linkedList;

//Problem statement :
//	
//Given a singly linked list of integers. Your task is to return the head of the reversed linked list.
//
//For example:
//The given linked list is 1 -> 2 -> 3 -> 4-> NULL. Then the reverse linked list is 4 -> 3 -> 2 -> 1 -> NULL and the head of the reversed linked list will be 4.
//Follow Up :
//Can you solve this problem in O(N) time and O(1) space complexity?
//
//Sample Input 1 :
//1
//1 2 3 4 5 6 -1
//
//Sample Output 1 :
//6 5 4 3 2 1 -1

public class ReverseLinkedList {
	public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
		if(head == null) return head;
        // Write your code here!
		LinkedListNode<Integer> curr = head.next;
		LinkedListNode<Integer> prev = head;

		while(curr!=null){
			prev.next = curr.next;
			curr.next = head;
			head = curr;
			curr = prev.next;
		}

		return head;
    }
}
