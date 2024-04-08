package binaryTreeQuestion;

//Problem statement :
//	
//You are given a binary search tree of integers with N nodes. You are also given references to two nodes 'P' and 'Q' from this BST.
//
//Your task is to find the lowest common ancestor(LCA) of these two given nodes.
//
//The lowest common ancestor for two nodes P and Q is defined as the lowest node that has both P and Q as descendants (where we allow a node to be a descendant of itself)
//
//A binary search tree (BST) is a binary tree data structure which has the following properties.
//
//• The left subtree of a node contains only nodes with data less than the node’s data.
//• The right subtree of a node contains only nodes with data greater than the node’s data.
//• Both the left and right subtrees must also be binary search trees.
//
//Sample Input 1 :
//3 5
//2 1 3 -1 -1 -1 5 -1 -1
//
//Sample Output 1:
//3


public class LcaInBST {
	public static TreeNode LCAinaBST(TreeNode root, TreeNode p, TreeNode q) {
        // Write your code here.
        int x = Math.min(p.data,q.data);
        int y = Math.max(p.data, q.data);
        while(root!=null){
            if((x<root.data && y>=root.data) || y == root.data  || x == root.data){
                break;
            }
            if(y<root.data){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }

        return root;
    }
}
