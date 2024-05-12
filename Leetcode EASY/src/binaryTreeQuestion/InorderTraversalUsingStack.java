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
        
        TreeNode curr = root;
        Stack<TreeNode> st = new Stack<>();
        while(curr!=null || !st.isEmpty()){
            if(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                TreeNode temp = st.pop();
                al.add(temp.data);
                curr = temp.right;
            }
        }

        return al;
    }
}
