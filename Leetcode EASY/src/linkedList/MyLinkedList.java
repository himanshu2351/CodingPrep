package linkedList;

//Problem Statement :
//
//Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
//A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
//If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.
//
//Implement the MyLinkedList class:
//
//MyLinkedList() Initializes the MyLinkedList object.
//int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
//void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
//void addAtTail(int val) Append a node of value val as the last element of the linked list.
//void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
//void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
// 
//Example 1:
//
//Input
//["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
//[[], [1], [3], [1, 2], [1], [1], [1]]
//Output
//[null, null, null, null, 2, null, 3]
		
class MyLLNode{
    int data;
    MyLLNode next;
    static int size = 0;

     public MyLLNode(int val){
        data = val;
        size++;
     }
}

class MyLinkedList {
    
    MyLLNode head;
    public MyLinkedList() {
        head = new MyLLNode(-1);
        MyLLNode.size = 1;
    }
    
    public int get(int index) {
        if(MyLLNode.size-1<=index) return -1;
        MyLLNode t = head;
        while(index-->0){
            t = t.next;
        }
        return t.next.data;
    }
    
    public void addAtHead(int val) {
        MyLLNode n = new MyLLNode(val);
        n.next = head.next;
        head.next = n;
    }
    
    public void addAtTail(int val) {
        MyLLNode t = head;
        MyLLNode n = new MyLLNode(val);
        while(t.next!=null){
            t = t.next;
        }
        t.next = n;
    }
    
    public void addAtIndex(int index, int val) {
        
        if(MyLLNode.size-1<index) return;
        else if(MyLLNode.size == index) addAtTail(val);
        else{
            MyLLNode t = head;
            MyLLNode n = new MyLLNode(val);
            while(index-->0){
                t = t.next;
            }
            n.next = t.next;
            t.next = n;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(MyLLNode.size-1<=index) return;
        MyLLNode t = head;
        while(index-->0){
            t = t.next;
        }
        MyLLNode.size--;
        t.next = t.next.next; 
    }
}
