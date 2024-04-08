package binaryTreeQuestion;

//Problem statement :
//
//You have been given a Binary Tree of integers. You are supposed to return the level order traversal of the given tree.
//
//Sample Input 1:
//3
//1 2 3 4 -1 5 6 -1 7 -1 -1 -1 -1 -1 -1
//1 2 3 -1 -1 -1 -1
//1 3 -1 2 -1 -1 -1
//
//Sample Output 1:
//1 2 3 4 5 6 7
//1 2 3
//1 3 2

import java.util.*;

public class LevelOrderTraversal {
	public static ArrayList<Integer> getLevelOrder(TreeNode root) {
	    //Your code goes here
		ArrayList<Integer> al = new ArrayList<>();
		if(root == null) return al;

		Queue<TreeNode> q = new LinkedList<>();

		q.add(root);

		while(!q.isEmpty()){
			TreeNode node = q.remove();

			if(node.left!=null) q.add(node.left);
			if(node.right!=null) q.add(node.right);

			al.add(node.data);
		}

		return al;
	  }
}
