package binaryTreeQuestion;

public class TreeNode {
    int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }
    public TreeNode(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.data = val;
        this.left = left;
        this.right = right;
    }
};
