package linkedList;

//Problem Statement :
//
//You are given the head of a singly linked-list. The list can be represented as:
//
//L0 → L1 → … → Ln - 1 → Ln
//Reorder the list to be on the following form:
//
//L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//You may not modify the values in the list's nodes. Only nodes themselves may be changed.
//
//Example 1:
//
//Input: head = [1,2,3,4]
//Output: [1,4,2,3]
		
public class ReorderList {
	public void reorderList(LinkedListNode<Integer> head) {

        if(head == null || head.next == null || head.next.next == null) return;

        LinkedListNode<Integer> walk = head;
        LinkedListNode<Integer> run = head;
        while(run!=null && run.next!=null){
            run=run.next.next;
            walk = walk.next;
        }

        LinkedListNode<Integer> h = walk.next;
        walk.next = null;
        LinkedListNode<Integer> x = h;
        LinkedListNode<Integer> curr = h.next;
        while(curr!=null){
            x.next = curr.next;
            curr.next = h;
            h = curr;
            curr = x.next;
        }
        x = h;
        walk = head;
        LinkedListNode<Integer> prev = null;
        while(walk!=null && x!=null){
            prev = x.next;
            x.next = walk.next;
            walk.next = x;
            walk = walk.next.next;
            x = prev;
        }

//        RECURSIVE SOLUTION

        // LinkedListNode<Integer> front = head;
        // LinkedListNode<Integer> curr = head.next;
        // LinkedListNode<Integer> travel = curr;
        // LinkedListNode<Integer> end = null;
        // LinkedListNode<Integer> currEnd = head;
        // while(travel.next!=null){
        //     currEnd = travel;
        //     travel = travel.next;
        // }
        // end = travel;
        // currEnd.next = null;
        // reorderList(curr);

        // front.next= end;
        // end.next = curr;

    }
}
