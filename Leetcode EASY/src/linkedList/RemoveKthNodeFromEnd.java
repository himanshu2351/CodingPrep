package linkedList;

//Problem statement :
//	
//You have been given a singly Linked List of 'N' nodes with integer data and an integer 'K'.
//
//Your task is to remove the 'K'th node from the end of the given Linked List and return the head of the modified linked list.
//
//Example:
//Input : 1 -> 2 -> 3 -> 4 -> 'NULL'  and  'K' = 2
//Output: 1 -> 2 -> 4 -> 'NULL'
//Explanation:
//After removing the second node from the end, the linked list become 1 -> 2 -> 4 -> 'NULL'.
//
//Sample Input 1 :
//6 3
//1 2 3 4 5 6 
//
//Sample Output 1 :
//1 2 3 5 6

public class RemoveKthNodeFromEnd {

	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K)
    {
        // Write your code here.
        if(head == null) return head;
        int size = 0;
        LinkedListNode<Integer> curr = head;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        curr = head;
        size-=K;
        if(size == 0){
            return head.next;
        }
        while(size-->1){
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return head;
    }
}
