/*0021-Merge Two Sorted List

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

Time Complexity - O(n)
Space Complexity - O(n)*/


public class MergeTwoSortedList {
	
	  public class ListNode {
	     int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null) return list2;
        else if(list2 == null) return list1;
        else{
            if(list1.val>list2.val){
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
            else{
                list1.next = mergeTwoLists(list1.next,list2);
                return list1;
            }
        }
    }
}
