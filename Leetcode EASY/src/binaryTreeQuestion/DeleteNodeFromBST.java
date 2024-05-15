package binaryTreeQuestion;

//Problem Statement :
//
//Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
//
//Basically, the deletion can be divided into two stages:
//Search for a node to remove.
//If the node is found, delete the node.
//
//Example 1:
//
//Input: root = [5,3,6,2,4,null,7], key = 3
//Output: [5,4,6,2,null,null,7]
		
public class DeleteNodeFromBST {
	public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;

        if(root.data == key){
            if(root.right==null) return root.left;
            if(root.left==null) return root.right;
            TreeNode rightLeft = root.right.left;
            TreeNode temp = root.left;
            while(temp.right!=null){
                temp = temp.right;
            }
            temp.right = rightLeft;
            root.right.left = root.left;
            return root.right;
        }

        if(root.data<key){
            root.right = deleteNode(root.right,key);
        }
        else{
            root.left = deleteNode(root.left,key);
        }
        return root;
    }
}
