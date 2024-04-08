package binaryTreeQuestion;

import java.util.*;

public class DiameterOfBinaryTree {
	static HashMap<TreeNodeGeneric,Integer> h = new HashMap<>();
    public static int diameterOfBinaryTree(TreeNodeGeneric<Integer> root) {
        // Write your code here.

        int leftHeight = 0;
        int rightHeight = 0;


        if(root == null){
            leftHeight = 0;
            rightHeight = 0;
            return 0;
        } 

        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);

        leftHeight = h.containsKey(root.left) ? h.get(root.left) : height(root.left);
        rightHeight = h.containsKey(root.right) ? h.get(root.right) : height(root.right);
        int d = Math.max((leftHeight+rightHeight),Math.max(l,r)); 

        // System.out.println(root.data+" "+l+" "+r+" "+leftHeight+" "+rightHeight+" "+d);

        return d;


    }

    public static int height(TreeNodeGeneric<Integer> root){

        if(root == null) return 0;
        if(h.containsKey(root)) return h.get(root);
        int leftHeight = h.containsKey(root.left) ? h.get(root.left) : height(root.left);
        int rightHeight = h.containsKey(root.right) ? h.get(root.right) : height(root.right);
        int height = 1+Math.max(leftHeight, rightHeight);
        h.put(root, height);
        return height;

    }
}
