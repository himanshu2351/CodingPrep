package linkedList;

//Problem Statement :
//
//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//
//Return true if there is a cycle in the linked list. Otherwise, return false.
//
//Example 1:
//
//Input: head = [3,2,0,-4], pos = 1
//Output: true

public class LinkedListCycle {
public boolean hasCycle(LinkedListNode<Integer> head) {
        
        if(head == null || head.next == null){
            return false;
        }
        
        LinkedListNode<Integer> walk = head.next;
        LinkedListNode<Integer> run = head.next.next;
        // boolean res = false;
        while(run!=null && run.next!=null){
            if(walk == run){
                return true;
            }
            walk = walk.next;
            run = run.next.next;
        }

        return false;
    }
}
