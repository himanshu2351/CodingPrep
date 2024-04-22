package linkedList;

import java.util.*;
import binaryTreeQuestion.TreeNode;

//Problem Statement :
//
//You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:
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
//Input: root = [1,2,3,4,5,6,7]
//Output: [1,#,2,3,#,4,5,6,7,#]

class PopulatingNextRightPointerInEachTreeNode {
	public TreeNode connect(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode n = q.poll();
            if(n==null){
                if(q.isEmpty()) break;
                else{
                    q.add(null);
                    continue;
                }
            }
            else{
                n.next = q.peek();
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
        }

        return root;
    }
}
