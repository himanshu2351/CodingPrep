package linkedList;

//Problem statement :
//	
//Given a singly linked list of 'N' nodes. The objective is to determine the middle node of a singly linked list. However, if the list has an even number of nodes, we return the second middle node.
//		
//Sample Input 1 :
//5
//1 2 3 4 5
//
//Sample Output 1 :
//3 4 5

public class MiddleOfLinkedlist {
	
	public static LinkedListNode<Integer> findMiddle(LinkedListNode<Integer> head)
    {
        // Write your code here.
        if(head==null) return head;

        LinkedListNode<Integer> walk = head;
        LinkedListNode<Integer> run = head;

        while(run!=null && run.next!=null){
            walk = walk.next;
            run = run.next.next;
        }

        return walk;
    }
}
