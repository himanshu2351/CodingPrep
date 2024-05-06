package linkedList;

//Problem Statement :
//
//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
//
//Example 1:
//
//Input: head = [1,2,6,3,4,5,6], val = 6
//Output: [1,2,3,4,5]
		
public class RemoveElements {
	public LinkedListNode<Integer> removeElements(LinkedListNode<Integer> head, int data) {
        if(head==null || (head.next == null && head.data == data)) return null;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = head;
        while(curr!=null){
            if(curr.data == data){
                if(prev == null){
                    head = head.next;
                    curr = head;
                }
                else{
                    prev.next = curr.next;
                    curr = curr.next;
                }
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
