package linkedList;

//Problem Statement :
//
//Design your implementation of the circular queue. The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle, and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer".
//
//One of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue. But using the circular queue, we can use the space to store new values.
//
//Implement the MyCircularQueue class:
//
//MyCircularQueue(k) Initializes the object with the size of the queue to be k.
//int Front() Gets the front item from the queue. If the queue is empty, return -1.
//int Rear() Gets the last item from the queue. If the queue is empty, return -1.
//boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
//boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
//boolean isEmpty() Checks whether the circular queue is empty or not.
//boolean isFull() Checks whether the circular queue is full or not.
//You must solve the problem without using the built-in queue data structure in your programming language. 
//
//Example 1:
//
//Input
//["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"]
//[[3], [1], [2], [3], [4], [], [], [], [4], []]
//Output
//[null, true, true, true, false, 3, true, true, true, 4]

class CircularQueueNode{
    int val;
    CircularQueueNode next;
    CircularQueueNode prev;

    public CircularQueueNode(int val){
        this.val = val;
    }
}

class MyCircularQueue {
    int size;
    CircularQueueNode head,tail;

    public MyCircularQueue(int k) {
        size = k;
        head = new CircularQueueNode(-1);
        tail = new CircularQueueNode(-1);

        head.next = tail;
        tail.prev = head;
        head.prev = tail;
        tail.next = head;
    }
    
    public boolean enQueue(int value) {
        if(size>0){
            CircularQueueNode n = new CircularQueueNode(value);
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
    
    public boolean deQueue() {
        if(!isEmpty()){
            CircularQueueNode n = head.next;
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
    
    public int Front() {
        if(!isEmpty()){
            return head.next.val;
        }
        return -1;
    }
    
    public int Rear() {
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