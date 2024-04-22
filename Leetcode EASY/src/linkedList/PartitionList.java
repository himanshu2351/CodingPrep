package linkedList;

//Problem Statement :
//	
//Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//You should preserve the original relative order of the nodes in each of the two partitions.
//
//Example 1:
//
//Input: head = [1,4,3,2,5,2], x = 3
//Output: [1,2,2,4,3,5]

public class PartitionList {
	public LinkedListNode<Integer> partition(LinkedListNode<Integer> head, int x) {
        if(head == null || head.next == null) return head;
        // return null;
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;
        while(curr!=null){
            if(curr.data>=x){
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        if(curr == null || curr.next == null) return head;

        LinkedListNode<Integer> temp = curr.next;
        LinkedListNode<Integer> prevTemp = curr;
        while(temp!=null){
            if(temp.data<x){
                if(prev == null){
                    prevTemp.next = temp.next;
                    temp.next = head;
                    head = temp;
                    temp = prevTemp.next;
                    prev = head;
                }
                else{
                    prevTemp.next = temp.next;
                    temp.next = curr;
                    prev.next = temp;
                    prev = temp;
                    temp = prevTemp.next;
                }
            }
            else{
                prevTemp = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
