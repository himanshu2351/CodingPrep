package linkedList;

//Problem Statement :
//
//Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
//
//Example 1:
//
//Input: head = [1,2,3,3,4,4,5]
//Output: [1,2,5]
		
public class RemoveDuplicatesFromSortedList2 {
	public LinkedListNode<Integer> deleteDuplicates(LinkedListNode<Integer> head) {
        if(head == null || head.next == null) return head;

        LinkedListNode<Integer> curr = head;
        boolean flag = false;
        if(curr.data == curr.next.data){
            flag = true;
            while(curr.next!= null && curr.data==curr.next.data){
                curr = curr.next;
            }
        }

        LinkedListNode<Integer> li = deleteDuplicates(curr.next);

        if(flag) return li;

        head.next = li;
        return head;
    }
}
