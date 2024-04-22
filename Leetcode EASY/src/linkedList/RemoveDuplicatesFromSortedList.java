package linkedList;

//Problem Statement :
//
//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//
//Example 1:
//
//Input: head = [1,1,2]
//Output: [1,2]
		
public class RemoveDuplicatesFromSortedList {
	public LinkedListNode<Integer> deleteDuplicates(LinkedListNode<Integer> head) {
        if(head==null || head.next == null) return head;

        LinkedListNode<Integer> li = deleteDuplicates(head.next);
        
        if(head.data == li.data){
            return li;
        }
        else{
            head.next = li;
            return head;
        }
    }
}
