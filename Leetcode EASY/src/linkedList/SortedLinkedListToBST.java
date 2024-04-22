package linkedList;

import binaryTreeQuestion.TreeNode;

public class SortedLinkedListToBST {
	public TreeNode sortedListToBST(LinkedListNode<Integer> head) {
        if(head==null) return null;
        if(head.next == null) return new TreeNode(head.data);

        int size = 0;
        LinkedListNode<Integer> curr = head;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        int k = size/2;
        curr = head;
        LinkedListNode<Integer> left = null;
        while(k-->0){
            left = curr;
            curr = curr.next;
        }
        left.next = null;
        left = head;
        TreeNode tree = new TreeNode(curr.data);
        tree.left = sortedListToBST(left);
        tree.right = sortedListToBST(curr.next);

        return tree;
    }
}
