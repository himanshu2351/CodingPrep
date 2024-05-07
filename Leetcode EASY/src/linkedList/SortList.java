package linkedList;

//Problem Statement :
//
//Given the head of a linked list, return the list after sorting it in ascending order.
//
//Example 1:
//
//Input: head = [4,2,1,3]
//Output: [1,2,3,4]

public class SortList {
	public LinkedListNode<Integer> sortList(LinkedListNode<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }

        LinkedListNode<Integer> walk = head;
        LinkedListNode<Integer> run = head;
        LinkedListNode<Integer> temp = null;

        while(run!=null && run.next!=null){
            temp = walk;
            walk = walk.next;
            run = run.next.next;
        }
        temp.next = null;
        head = sortList(head);
        walk = sortList(walk);

        head = merge(head,walk);
        return head;
    }

    public LinkedListNode<Integer> merge(LinkedListNode<Integer> l1, LinkedListNode<Integer> l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        LinkedListNode<Integer> ans = null;
        if(l1.data>l2.data){
            ans = l2;
            ans.next = merge(l1,l2.next);
        }
        else{
            ans = l1;
            ans.next = merge(l1.next,l2);
        }
        return ans;
    }
}
