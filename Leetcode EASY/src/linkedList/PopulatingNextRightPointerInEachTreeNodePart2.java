package linkedList;

import binaryTreeQuestion.TreeNode;

//Problem Statement :
//
//Given a binary tree
//
//struct Node {
//  int val;
//  Node *left;
//  Node *right;
//  Node *next;
//}
//Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
//
//Initially, all next pointers are set to NULL.
//
//Example 1:
//
//Input: root = [1,2,3,4,5,null,7]
//Output: [1,#,2,3,#,4,5,7,#]

public class PopulatingNextRightPointerInEachTreeNodePart2 {
	public TreeNode connect(TreeNode root) {
        if(root == null) return root;

        root.next = null;
        TreeNode dummy = new TreeNode(0);
        TreeNode pre = dummy;
        TreeNode tree = root;
        while(tree != null){
            if(tree.left!=null){
                pre.next = tree.left;
                pre = pre.next;
            }
            if(tree.right!=null){
                pre.next = tree.right;
                pre = pre.next;
            }
            tree = tree.next;
            if(tree == null){
                pre = dummy;
                tree = dummy.next;
                dummy.next = null;
            }
        }
        return root;
    }
}
