package binaryTreeQuestion;

import java.util.*;

//Problem Statement :
//
//Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
//
//Example 1:
//
//Input: root = [1,2,3,null,5,null,4]
//Output: [1,3,4]

public class RightSideView {
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        if(root == null) return al;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode t = q.remove();
            if(t==null){
                if(!q.isEmpty()) q.add(null);
                continue;
            }
            if(q.peek()==null){
                al.add(t.data);
            }
            if(t.left!=null) q.add(t.left);
            if(t.right!=null) q.add(t.right);
        }
        return al;
    }
}
