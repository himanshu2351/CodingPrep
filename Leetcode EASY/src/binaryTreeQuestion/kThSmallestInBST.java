package binaryTreeQuestion;

//import java.util.Stack;

//Problem Statement :
//
//Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
//
//Example 1:
//
//Input: root = [3,1,4,null,2], k = 1
//Output: 1

public class kThSmallestInBST {
	int index=-1;
    int num = -1;
    public int kthSmallest(TreeNode root, int k) {
    	
    	// ----------Solution without extra space----------
    	
        index = k;
        find(root);
        return num;
        
        // ----------Solution with extra space----------

        // if(root==null) return -1;
        // if(k==0){
        //     return root.val;
        // }
        // Stack<TreeNode> st = new Stack<>();
        // TreeNode curr = root;
        // while(curr!=null || !st.isEmpty()){
        //     if(curr!=null){
        //         st.push(curr);
        //         curr = curr.left;
        //     }
        //     else{
        //         TreeNode t = st.pop();
        //         k--;
        //         if(k==0) return t.val;
        //         curr = t.right;
        //     }
        // }
        
        // return -1;
    }

    public void find(TreeNode root){
        if(root.left!=null){
            find(root.left);
        }
        index--;
        if(index == 0){
            num = root.data;
            return;
        }
        if(root.right!=null){
            find(root.right);
        }
    }
}
