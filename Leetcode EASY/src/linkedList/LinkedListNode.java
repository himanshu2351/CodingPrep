package linkedList;

public class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	LinkedListNode<T> prev;
	LinkedListNode<T> child;
	LinkedListNode<T> random;
	public LinkedListNode(T data) 
    {
    	this.data = data;
	}
	public LinkedListNode(T data, LinkedListNode<T> next) {
		this.data = data;
		this.next = next;
	}
}
