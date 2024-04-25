package linkedList;

//Problem Statement :
//
//A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
//
//Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
//
//For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.
//
//Return the head of the copied linked list.
//
//The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
//
//val: an integer representing Node.val
//random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
//Your code will only be given the head of the original linked list.
//
//Example 1:
//
//Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
//Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]

public class CopyListWithRandomPointer {
	public LinkedListNode<Integer> copyRandomList(LinkedListNode<Integer> head) {
        if(head == null) return head;

        LinkedListNode<Integer> n = head;
        while(n!=null){
            LinkedListNode<Integer> temp = n.next;
            n.next = new LinkedListNode<Integer>(n.data);
            n.next.next = temp;
            n = temp;
        }
        n = head;
        while(n!=null){
            LinkedListNode<Integer> rand = n.random;
            if(rand!=null) n.next.random = rand.next;
            n = n.next.next;
        }
        n = head;
        LinkedListNode<Integer> ans = n.next;
        LinkedListNode<Integer> a = ans;
        while(n!=null){
            LinkedListNode<Integer> copy = n.next.next;
            if(copy!=null) ans.next = copy.next;
            ans = ans.next;
            n.next = copy;
            n=copy;

        }
        return a;
        
        // Solution with extra space
        
        // ArrayList<LinkedListNode<Integer>> o = new ArrayList<>();
        // ArrayList<LinkedListNode<Integer>> d = new ArrayList<>();
        // LinkedListNode<Integer> ans = null;
        // LinkedListNode<Integer> a = ans;
        // LinkedListNode<Integer> n = head;
        // while(n!=null){
        //     if(ans==null) {
        //         ans = new LinkedListNode<Integer>(n.data);
        //         a = ans;
        //     }
        //     else{
        //         ans.next = new LinkedListNode<Integer>(n.data);
        //         ans = ans.next;
        //     }
        //     o.add(n);
        //     d.add(ans);

        //     n=n.next;
        // }

        // for(int i=0;i<d.size();i++){
        //     if(o.get(i).random == null){
        //         d.get(i).random = null;
        //     }
        //     else{
        //         int x = o.indexOf(o.get(i).random);
        //         d.get(i).random = d.get(x);
        //     }
        // }

        // return a;
    }
}
