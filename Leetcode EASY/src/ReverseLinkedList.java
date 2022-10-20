/*0206 - Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.

		 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
 

Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 

Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?

		
		
		
TC -> O(n)
SC -> O(1)
*/

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		
///////////////////////////     Iterative Soln     ///////////////////////////////		
		
//        ListNode prev = null, curr = head, temp = null;
//        while(curr!=null){
//            temp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//        
//        return prev;
		
		
///////////////////////////   Recursive Soln    ///////////////////////////////
		
		
        if(head.next == null || head == null) return head;
        ListNode temp = reverseList(head.next);
        ListNode prev = head.next;
        prev.next = head;
        head.next = null;
        
        return temp;
    }
}
