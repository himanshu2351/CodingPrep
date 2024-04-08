package binaryTreeQuestion;

import java.util.*;

//Problem statement:
//
//You have been given a Binary Tree of 'n' nodes, where the nodes have integer values. Your task is to return the In-Order traversal of the given binary tree.


public class InorderTraversalUsingStack {
	
	public static List< Integer > getInOrderTraversal(TreeNode root) {
        // Write your code here.
        List<Integer> al = new ArrayList<>();
        if(root==null) return al;
        Stack<TreeNode> st = new Stack<>();
        helper(root,st,al);
        return al;
    }

    public static void helper(TreeNode root, Stack<TreeNode> st, List<Integer> al){

        if(root == null){
            return;
        }

        st.push(root);
        helper(root.left,st,al);
        al.add(st.pop().data);
        helper(root.right,st,al);
    }
}
