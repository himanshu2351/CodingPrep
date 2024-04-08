package binaryTreeQuestion;

class TreeNodeGeneric<T> {
    public T data;
    public TreeNodeGeneric<T> left;
    public TreeNodeGeneric<T> right;

    TreeNodeGeneric(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}