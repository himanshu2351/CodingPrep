package linkedList;

//Problem statement :
//	
//You are given an arbitrary linked list consisting of 'N' nodes having integer values. You need to perform insertion sort on the linked list and print the final list in sorted order.
//
//In other words, you are given a singly linked list, you need to perform insertion sort on it.
//
//Insertion Sort is a sorting algorithm that removes one element from the input data, finds the location it belongs within the sorted list and inserts it there. It repeats until no input elements remain.
//
//Sample Input 1
//2
//4 2 1 3 -1
//19 3 6 1 5 -1
//
//Sample Output 1
//1 2 3 4
//1 3 5 6 19

public class InsertionSortInLinkedList {
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = new LinkedListNode<Integer>(1);
		head.next = new LinkedListNode<Integer>(4);
		head.next.next = new LinkedListNode<Integer>(2);
		head.next.next.next = new LinkedListNode<Integer>(3);
		head = insertionSortLL(head);
		
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public static LinkedListNode<Integer> insertionSortLL(LinkedListNode<Integer> head)
    {
        // Write your code here
        if(head==null) return head;

        LinkedListNode<Integer> curr = head.next;
        LinkedListNode<Integer> prev1 = head;
        while(curr!=null){
        	LinkedListNode<Integer> temp = head;
        	LinkedListNode<Integer> prev = null;
            while(temp!=curr){
                if(temp.data<curr.data){
                    prev = temp;
                    temp = temp.next;
                }
                else{
                	prev1.next = curr.next;
                    curr.next = temp;
                    if(temp == head){
                        head = curr;
                    }
                    else{
                        prev.next = curr;
                    }
                    break;
                }
            }
            if(temp == curr){
                prev1 = curr;
                curr = curr.next;
            }
            else {
                curr = prev1.next;
            }
        }

        return head;
    }
}
