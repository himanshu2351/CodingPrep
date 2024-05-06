package linkedList;

//Problem Statement :
//
//Given the head of a singly linked list, return true if it is a 
//palindrome or false otherwise.
//
//Example 1:
//
//Input: head = [1,2,2,1]
//Output: true
//
//Example 2:
//
//Input: head = [1,2]
//Output: false

public class PalindromeLinkedList {
	public boolean isPalindrome(LinkedListNode<Integer> head) {
        if(head == null || head.next == null) return true;
        LinkedListNode<Integer> walk = head;
        LinkedListNode<Integer> run = head;
        LinkedListNode<Integer> temp = null;
        while(run!=null && run.next!=null){
            temp= walk;
            walk = walk.next;
            run = run.next.next;
        }
        temp.next = null;

        LinkedListNode<Integer> rev = walk;
        LinkedListNode<Integer> move = walk.next;
        while(move!=null){
            rev.next = move.next;
            move.next = walk;
            walk = move;
            move = rev.next;
        }

        while(head!=null){
            if(head.data!=walk.data){
                return false;
            }
            head = head.next;
            walk = walk.next;
        }

        return true;
    }
}
