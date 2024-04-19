package linkedList;

//Problem statement :
//	
//Given a singly linked list, you have to detect the loop and remove the loop from the linked list, if present. You have to make changes in the given linked list itself and return the updated linked list.
//
//Expected Complexity: Try doing it in O(n) time complexity and O(1) space complexity. Here, n is the number of nodes in the linked list.
//
//Sample Input:
//6 2
//1 2 3 4 5 6 
//
//Sample Output:
//1 2 3 4 5 6

public class DetectAndRemoveLoop {
	public class Solution {
		  public static LinkedListNode<Integer> removeLoop(LinkedListNode<Integer> head) {
		    // Write your code here.

		    if(head == null || head.next == null) return head;
		    
		    LinkedListNode<Integer> walk = head;
		    LinkedListNode<Integer> run = head;

		    while(run!=null && run.next!=null){
		      walk = walk.next;
		      run = run.next.next;
		      if(run == walk) break;
		    }
		    if(run == null || run.next == null) return head;

		    walk = head;
		    if(run==head){
		      while(walk.next!=run){
		        walk = walk.next;
		      }
		      walk.next = null;
		    }
		    else{
		      while(run.next != walk){
		        walk = walk.next;
		        if(run.next == walk){
		          run.next = null;
		          break;
		        }
		        else{
		          run = run.next;
		        }
		      }
		    }
		    

		    return head;
		    
		  }
	}
}
