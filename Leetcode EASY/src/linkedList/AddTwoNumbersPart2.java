package linkedList;

//Problem Statement :
//
//You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//Example 1:
//
//Input: l1 = [7,2,4,3], l2 = [5,6,4]
//Output: [7,8,0,7]

public class AddTwoNumbersPart2 {
	public LinkedListNode<Integer> addTwoNumbers(LinkedListNode<Integer> l1, LinkedListNode<Integer> l2) {
        if(l1==null && l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;

        LinkedListNode<Integer> curr = l1;
        LinkedListNode<Integer> rev = l1;
        int size = 0;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        curr = l2;
        while(curr!=null){
            size--;
            curr = curr.next;
        }

        if(size > 0){
            while(size-->0){
                LinkedListNode<Integer> li = new LinkedListNode<Integer>(0);
                li.next = l2;
                l2 = li;
            }
        }
        else{
            while(size++<0){
                LinkedListNode<Integer> li = new LinkedListNode<Integer>(0);
                li.next = l1;
                l1 = li;
            }
        }

        LinkedListNode<Integer> ans = addNumbers(l1.next,l2.next);
        int data = 0;
        data = l1.data+l2.data+ans.data;
        if(data < 10){
            ans.data = data;
        }
        else{
            ans.data = data%10;
            LinkedListNode<Integer> c = new LinkedListNode<Integer>(data/10);
            c.next = ans;
            ans = c;
        }

        return ans;
    }

    public LinkedListNode<Integer> addNumbers(LinkedListNode<Integer> l1, LinkedListNode<Integer> l2){
        if(l1==null && l2==null) return new LinkedListNode<Integer>(0);
        if(l1==null) return l2;
        if(l2==null) return l1;


        LinkedListNode<Integer> ans = addNumbers(l1.next,l2.next);
        int data = 0;
        
        data = l1.data+l2.data+ans.data;
        ans.data = data%10;
        LinkedListNode<Integer> c = new LinkedListNode<Integer>(data/10);
        c.next = ans;

        return c;
    }
}
