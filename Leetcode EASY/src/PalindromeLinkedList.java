/*0234 - Palindrome Linked List

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

		 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 

Follow up: Could you do it in O(n) time and O(1) space?
		
		

TC -> O(n)
SC -> O(1)
*/
public class PalindromeLinkedList {
public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null) return true;
        
        ListNode mid = middle(head);
        ListNode rev = reverse(mid);
        
        ListNode temp = head;
        
        while(temp!=null && rev!=null){
            if(temp.val!=rev.val) return false;
            temp = temp.next;
            rev = rev.next;
        }
        
        return true;
    }
    public ListNode middle(ListNode head){
        ListNode walker = head;
        ListNode runner = head;
        
        while(runner != null && runner.next!=null){
            walker = walker.next;
            runner = runner.next.next;
        }
        
        return walker;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null, curr = head, temp = null;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
}
