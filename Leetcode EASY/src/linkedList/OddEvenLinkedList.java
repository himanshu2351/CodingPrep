package linkedList;

//Problem Statement :
//
//Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
//The first node is considered odd, and the second node is even, and so on.
//Note that the relative order inside both the even and odd groups should remain as it was in the input.
//You must solve the problem in O(1) extra space complexity and O(n) time complexity.
//
//Example 1:
//
//Input: head = [1,2,3,4,5]
//Output: [1,3,5,2,4]

public class OddEvenLinkedList {
	public LinkedListNode<Integer> oddEvenList(LinkedListNode<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }
        LinkedListNode<Integer> odd = head;
        LinkedListNode<Integer> even = head.next;
        LinkedListNode<Integer> curr = head.next.next;
        LinkedListNode<Integer> prev = head.next;
        int i=3;
        while(curr!=null){
            if(i%2!=0){
                prev.next = curr.next;
                odd.next = curr;
                curr.next = even;
                odd = odd.next;
                curr = prev.next;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
            i++;
        }
        return head;
    }
}
