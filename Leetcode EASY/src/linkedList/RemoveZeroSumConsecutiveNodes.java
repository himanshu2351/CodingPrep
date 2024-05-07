package linkedList;

import java.util.ArrayList;

//Problem Statement :
//
//Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.
//After doing so, return the head of the final linked list.  You may return any such answer.
//(Note that in the examples below, all sequences are serializations of ListNode objects.)
//
//Example 1:
//
//Input: head = [1,2,-3,3,1]
//Output: [3,1]


public class RemoveZeroSumConsecutiveNodes {
	public LinkedListNode<Integer> removeZeroSumSublists(LinkedListNode<Integer> head) {
        if(head==null) return head;
        if(head.data ==0){
            if(head.next == null) return null;
            else head = head.next;
        }
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> ind = new ArrayList<>();
        LinkedListNode<Integer> curr = head;
        int sum = 0;
        int a = 0;
        while(curr!=null){
            sum += curr.data;
            // System.out.println(sum);
            if(sum==0){
                al = new ArrayList<>();
                ind = new ArrayList<>();
            }
            else if(!al.contains(sum)){
                al.add(sum);
                ind.add(a);
            }
            else{
                // System.out.println("found");
                while(!al.isEmpty() && al.get(al.size()-1)!=sum){
                    al.remove(al.size()-1);
                    ind.remove(ind.size()-1);
                }
            }
            a++;
            curr = curr.next;
        }
        if(sum==0) return null;
        for(int x : al){
            System.out.println(x);
        }
        LinkedListNode<Integer> prev = null;
        curr = head;
        sum = 0;
        int b = 0;
        while(!al.isEmpty() && curr!=null){
            sum += curr.data;
            if(al.get(0)!=sum || b!=ind.get(0)){
                curr = curr.next;
            }
            else{
                if(prev == null){
                    head = curr;
                    prev = curr;
                    curr = curr.next;
                }
                else{
                    prev.next = curr;
                    prev = curr;
                    curr = curr.next;
                }
                al.remove(0);
                ind.remove(0);
            }
            b++;
        }
        prev.next = null;
        return head;
    }
}
