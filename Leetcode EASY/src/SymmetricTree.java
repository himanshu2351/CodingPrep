//0101 - Symmetric Tree
//
//Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
//
// 
//
//Example 1:
//
//
//Input: root = [1,2,2,3,4,4,3]
//Output: true
//Example 2:
//
//
//Input: root = [1,2,2,null,3,null,3]
//Output: false
// 
//
//Constraints:
//
//The number of nodes in the tree is in the range [1, 1000].
//-100 <= Node.val <= 100

//Time Complexity - O(n)
//Space Complexity - O(1)

public class SymmetricTree {
	
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

	
	public boolean isSymmetric(TreeNode root) {
        TreeNode left = root;
        TreeNode right = root;
        
        return (root == null || traverse(left,right));
        
    }
    
    public boolean traverse(TreeNode left, TreeNode right){
        if(left==null || right==null){
            return left == right;
        }
        if(left.val!=right.val){
            return false;
        }
        
        return traverse(left.left,right.right) && traverse(left.right,right.left);
    }
}
