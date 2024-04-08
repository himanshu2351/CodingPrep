package binaryTreeQuestion;

//Problem statement :
//
//You have been given a Binary Tree of distinct integers and two nodes ‘X’ and ‘Y’. You are supposed to return the LCA (Lowest Common Ancestor) of ‘X’ and ‘Y’.
//The LCA of ‘X’ and ‘Y’ in the binary tree is the shared ancestor of ‘X’ and ‘Y’ that is located farthest from the root.
//
//Note :
//You may assume that given ‘X’ and ‘Y’ definitely exist in the given binary tree.
//
//Sample Input 1 :
//1 2 3 4 7 -1 -1 -1 -1 -1 -1
//4 7
//Sample Output 1 :
//2
//
//Sample Input 2 :
//1 2 3 -1 -1 -1 -1
//2 3
//Sample Output 2 :
//1


public class LcaOfBinaryTree {
	
	public static int lowestCommonAncestor(TreeNodeGeneric<Integer> root, int x, int y) {
        //    Write your code here.
       if(root == null) return -1;

       if(root.data==x || root.data== y) return root.data;

       int left = lowestCommonAncestor(root.left,x,y);
       int right = lowestCommonAncestor(root.right,x,y);

       if(left != -1 && right != -1){
           return root.data;
       }

       if(left != -1){
           return left;
       }
       else{
           return right;
       }

    }
}
