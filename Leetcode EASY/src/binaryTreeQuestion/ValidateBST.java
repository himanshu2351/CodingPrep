package binaryTreeQuestion;

//Problem Statement :
//
//Given the root of a binary tree, determine if it is a valid binary search tree (BST).
//
//A valid BST is defined as follows:
//The left subtree of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.
// 
//Example 1:
//
//Input: root = [2,1,3]
//Output: true

public class ValidateBST {
	public boolean isValididBST(TreeNode root) {
        if(root==null) return true;
        if(root.left == null && root.right==null) return true;

        int[] l = validate(root.left);
        int[] r = validate(root.right);

        if(l[0]>l[1] || r[0]>r[1]){
            return false;
        }

        if(root.left!=null && root.right!=null){
            if(root.data>root.left.data && root.data<root.right.data && root.data>l[1] && root.data<r[0]){
                return true;
            }
            else{
                return false;
            }
        }
        else if(root.left!=null){
            if(root.data>root.left.data && root.data>l[1]){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(root.data<root.right.data && root.data<r[0]){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public int[] validate(TreeNode root){
        int[] arr = new int[2];
        if(root == null){
        	arr[0] = Integer.MAX_VALUE;
            arr[1] = Integer.MIN_VALUE;
            return arr;
        }
        if(root.left == null && root.right==null){
            arr[0] = root.data;
            arr[1] = root.data;
            return arr;
        }

        int[] l = validate(root.left);
        int[] r = validate(root.right);
        if(l[0]>l[1] || r[0]>r[1]){
        	arr[0] = Integer.MAX_VALUE;
            arr[1] = Integer.MIN_VALUE;
            return arr;
        }
        if(root.left!=null && root.right!=null){
            if(root.data>root.left.data && root.data<root.right.data && root.data>l[1] && root.data<r[0]){
                arr[0] = l[0];
                arr[1] = r[1];
            }
            else{
            	arr[0] = Integer.MAX_VALUE;
                arr[1] = Integer.MIN_VALUE; 
            }
            return arr;
        }
        else if(root.left!=null){
            if(root.data>root.left.data && root.data>l[1]){
                arr[0] = l[0];
                arr[1] = root.data;
            }
            else{
                arr[0] = Integer.MAX_VALUE;
                arr[1] = Integer.MIN_VALUE;
            }
            return arr;
        }
        else{
            if(root.data<root.right.data && root.data<r[0]){
                arr[0] = root.data;
                arr[1] = r[1];
            }
            else{
                arr[0] = Integer.MAX_VALUE;
                arr[1] = Integer.MIN_VALUE;
            }
            return arr;
        }
    }
}
