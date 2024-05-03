package linkedList;

//Problem Statement :
//
//Design your implementation of the circular double-ended queue (deque).
//
//Implement the MyCircularDeque class:
//
//MyCircularDeque(int k) Initializes the deque with a maximum size of k.
//boolean insertFront() Adds an item at the front of Deque. Returns true if the operation is successful, or false otherwise.
//boolean insertLast() Adds an item at the rear of Deque. Returns true if the operation is successful, or false otherwise.
//boolean deleteFront() Deletes an item from the front of Deque. Returns true if the operation is successful, or false otherwise.
//boolean deleteLast() Deletes an item from the rear of Deque. Returns true if the operation is successful, or false otherwise.
//int getFront() Returns the front item from the Deque. Returns -1 if the deque is empty.
//int getRear() Returns the last item from Deque. Returns -1 if the deque is empty.
//boolean isEmpty() Returns true if the deque is empty, or false otherwise.
//boolean isFull() Returns true if the deque is full, or false otherwise.
// 
//Example 1:
//
//Input
//["MyCircularDeque", "insertLast", "insertLast", "insertFront", "insertFront", "getRear", "isFull", "deleteLast", "insertFront", "getFront"]
//[[3], [1], [2], [3], [4], [], [], [], [4], []]
//Output
//[null, true, true, true, false, 2, true, true, true, 4]


class CircularDequeNode{
    int val;
    CircularDequeNode next;
    CircularDequeNode prev;

    public CircularDequeNode(int val){
        this.val = val;
    }
}

class MyCircularDeque {

    int size;
    CircularDequeNode head,tail;

    public MyCircularDeque(int k) {
        size = k;
        head = new CircularDequeNode(-1);
        tail = new CircularDequeNode(-1);

        head.next = tail;
        tail.prev = head;
        head.prev = tail;
        tail.next = head;
    }
    
    public boolean insertFront(int value) {
        if(size>0){
            CircularDequeNode n = new CircularDequeNode(value);
            n.next = head.next;
            n.prev = head;
            head.next.prev = n;
            head.next = n;
            size--;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean insertLast(int value) {
        if(size>0){
            CircularDequeNode n = new CircularDequeNode(value);
            n.next = tail;
            n.prev = tail.prev;
            tail.prev.next = n;
            tail.prev = n;
            size--;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean deleteFront() {
        if(!isEmpty()){
            CircularDequeNode n = head.next;
            head.next = n.next;
            n.next.prev = head;
            n.next = null;
            n.prev = null;
            size++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean deleteLast() {
        if(!isEmpty()){
            CircularDequeNode n = tail.prev;
            tail.prev = n.prev;
            n.prev.next = tail;
            n.next = null;
            n.prev = null;
            size++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getFront() {
        if(!isEmpty()){
            return head.next.val;
        }
        return -1;
    }
    
    public int getRear() {
        if(!isEmpty()){
            return tail.prev.val;
        }
        return -1;
    }
    
    public boolean isEmpty() {
        if(head.next == tail){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(size==0){
            return true;
        }
        return false;
    }
}
