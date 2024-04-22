package linkedList;

import binaryTreeQuestion.TreeNode;

//Problem Statement :
//
//Given the root of a binary tree, flatten the tree into a "linked list":
//
//The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
//The "linked list" should be in the same order as a pre-order traversal of the binary tree.
//
//Example 1:
//
//Input: root = [1,2,5,3,4,null,6]
//Output: [1,null,2,null,3,null,4,null,5,null,6]

public class FlattenBinaryTreeToLinkedList {
	public void flatten(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return;
        }

        TreeNode tree = root;
        while(tree!=null){
            if(tree.left == null){
                tree = tree.right;
            }
            else{
                TreeNode l = tree.left;
                while(l.right!=null){
                    l = l.right;
                }
                l.right = tree.right;
                tree.right = tree.left;
                tree.left = null;
                tree = tree.right;
            }
        }
    }
}
