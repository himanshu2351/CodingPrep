package linkedList;

//Problem Statement :
//
//Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
//
//Do not modify the linked list.
//
//Example 1:
//
//Input: head = [3,2,0,-4], pos = 1
//Output: tail connects to node index 1

public class LinkedListCyclePart2 {
public LinkedListNode<Integer> detectCycle(LinkedListNode<Integer> head) {
        
        if(head == null || head.next == null){
            return null;
        }

        LinkedListNode<Integer> walk = head.next;
        LinkedListNode<Integer> run = head.next.next;

        while(run!=null && run.next!=null){
            if(run == walk) break;
            walk = walk.next;
            run = run.next.next;
        }

        if(run!=walk) return null;

        run = head;
        while(run!=walk){
            run = run.next;
            walk = walk.next;
        }

        return run;
    }
}
