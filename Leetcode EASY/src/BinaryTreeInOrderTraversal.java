//0094 - Binary Tree Inorder Traversal
//
//Given the root of a binary tree, return the inorder traversal of its nodes' values.
//
//		 
//
//Example 1:
//
//
//Input: root = [1,null,2,3]
//Output: [1,3,2]
//Example 2:
//
//Input: root = []
//Output: []
//Example 3:
//
//Input: root = [1]
//Output: [1]
// 
//
//Constraints:
//
//The number of nodes in the tree is in the range [0, 100].
//-100 <= Node.val <= 100

//Time Complexity - O(n)
//Space Complexity - O(n)

import java.util.*;

public class BinaryTreeInOrderTraversal {
	List<Integer> al = new ArrayList<Integer>();
	
	public class TreeNode {
		 	int val;
		 	TreeNode left;
		 	TreeNode right;
		 	TreeNode() {}
		 	TreeNode(int val) { this.val = val; }
		 	TreeNode(int val, TreeNode left, TreeNode right) {
		 		this.val = val;
		 		this.left = left;
		 		this.right = right;
	    }
	 }
	
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root == null) return new ArrayList<Integer>();
        
        inorderTraversal(root.left);
        al.add(root.val);
        inorderTraversal(root.right);
        
        return al;
        
    }
}
