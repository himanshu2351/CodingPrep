package linkedList;

//Problem Statement :
//
//Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.
//
//The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.
//
//The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.
//
//Return an array of the k parts.
//
//Example 1:
//
//Input: head = [1,2,3], k = 5
//Output: [[1],[2],[3],[],[]]


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SplitLinkedListInParts {
	public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] li = new ListNode[k];
        int size = 0;
        ListNode curr = head;
        while(curr!=null){
            size++;
            curr = curr.next;
        }

        if(size<k){
            ListNode prev = null;
            int i = 0;
            while(head!=null){
                prev = head;
                head = head.next;
                prev.next = null;
                li[i++] = prev;
            }
            return li;
        }

        int q = size/k;
        int r = size%k;

        curr = head;
        for(int i=0;i<k;i++){
            int x = q;
            ListNode temp = curr;
            ListNode prev = null;
            while(x-->0){
                prev = curr;
                curr = curr.next;
            }
            if(r-->0){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            li[i] = temp;
        }

        return li;
    }
}
