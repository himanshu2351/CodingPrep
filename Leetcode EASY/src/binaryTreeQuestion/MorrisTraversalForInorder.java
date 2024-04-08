package binaryTreeQuestion;

//Problem Statement :
//
//Write code to print Inorder traversal of binary tree using Morris traversal.

import java.util.*;

public class MorrisTraversalForInorder {
	public static List< Integer > getInOrderTraversal(TreeNode root) {
        // Write your code here.
        List<Integer> al = new ArrayList<>();
        if(root==null) return al;


        TreeNode curr = root;
        while(curr!=null){
            if(curr.left == null){
                al.add(curr.data);
                curr = curr.right;
            }
            else{
                TreeNode r = curr.left;
                while(r.right!=null){
                    r= r.right;
                }
                r.right = curr;
                TreeNode t = curr;
                curr = curr.left;
                t.left = null;
            }
        }
        return al;
    }
}
