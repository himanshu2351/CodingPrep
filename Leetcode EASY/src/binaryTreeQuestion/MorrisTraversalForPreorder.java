package binaryTreeQuestion;

//Problem Statement :
//	
//Write code to print Preorder traversal of binary tree using Morris traversal

import java.util.*;

public class MorrisTraversalForPreorder {
	
	public static List< Integer > getInOrderTraversal(TreeNode root) {
        // Write your code here.
        List<Integer> al = new ArrayList<>();
        if(root==null) return al;
        
        TreeNode curr = root;
        
        while(curr!=null){
            al.add(curr.data);
            if(curr.left == null){
                curr = curr.right;
            }
            else{
                TreeNode r = curr.left;
                while(r.right!=null){
                    r= r.right;
                }
                r.right = curr.right;
                TreeNode t = curr;
                curr = curr.left;
                t.right = null;
            }
        }
        return al;
    }
}
