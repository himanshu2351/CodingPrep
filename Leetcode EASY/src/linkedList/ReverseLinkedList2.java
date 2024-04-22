package linkedList;

//Problem Statement :
//
//Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
//
//Example 1:
//
//Input: head = [1,2,3,4,5], left = 2, right = 4
//Output: [1,4,3,2,5]

public class ReverseLinkedList2 {
	public LinkedListNode<Integer> reverseBetween(LinkedListNode<Integer> head, int left, int right) {
        if(head == null || head.next == null || left == right){
            return head;
        }

        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prevLeft = null, leftNode = null, rightNode = null, postRight = null;
        int indx = 1;
        while(curr != null){
            if(indx == left-1){
                prevLeft = curr;
            }
            else if(indx == left){
                leftNode = curr;
            }
            else if(indx == right){
                rightNode = curr;
            }
            else if(indx == right+1){
                postRight = curr;
            }
            indx++;
            curr = curr.next;
        }

        while(left!=right){
            if(prevLeft == null){
                curr = leftNode;
                leftNode = leftNode.next;
                head = leftNode;
            }
            else{
                curr = prevLeft.next;
                prevLeft.next = curr.next;
            }
            left++;
            curr.next = postRight;
            rightNode.next = curr;
            postRight = curr;

        }
        return head;
    }
}
