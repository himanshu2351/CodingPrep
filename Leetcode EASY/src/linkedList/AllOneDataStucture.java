package linkedList;

import java.util.*;

//Problem Statement :
//
//Design a data structure to store the strings' count with the ability to return the strings with minimum and maximum counts.
//
//Implement the AllOne class:
//
//AllOne() Initializes the object of the data structure.
//inc(String key) Increments the count of the string key by 1. If key does not exist in the data structure, insert it with count 1.
//dec(String key) Decrements the count of the string key by 1. If the count of key is 0 after the decrement, remove it from the data structure. It is guaranteed that key exists in the data structure before the decrement.
//getMaxKey() Returns one of the keys with the maximal count. If no element exists, return an empty string "".
//getMinKey() Returns one of the keys with the minimum count. If no element exists, return an empty string "".
//Note that each function must run in O(1) average time complexity.
//
//Example 1:
//
//Input
//["AllOne", "inc", "inc", "getMaxKey", "getMinKey", "inc", "getMaxKey", "getMinKey"]
//[[], ["hello"], ["hello"], [], [], ["leet"], [], []]
//Output
//[null, null, null, "hello", "hello", null, "hello", "leet"]


class Node{
    String s;
    int val;
    Node prev;
    Node next;

    public Node(String s){
        this.s = s;
        val = 1;
    }
}

class ValNode{
    int val;
    ValNode prev;
    ValNode next;

    Node head = null;
    Node tail = null;
    public ValNode(int val){
        this.val = val;
        head =  new Node("1");
        tail = new Node("-1");
        head.val = 0;
        tail.val = 0;
        head.next = tail;
        tail.prev = head;
    }
}

public class AllOneDataStucture {
	HashMap<String, Node> h = null;
    HashMap<Integer, ValNode> val = null;
    ValNode head = null;
    ValNode tail = null;
    TreeSet<Integer> set= null;
    public AllOneDataStucture() {
        set = new TreeSet<>();
        h = new HashMap<>();
        val = new HashMap<>();
        head = new ValNode(0);
        tail = new ValNode(0);
        head.next = tail;
        tail.prev = head;
    }
    
    public void inc(String key) {
        Node node = null;
        ValNode v = null;
        if(h.containsKey(key)){
            node = h.get(key);
            node.prev.next = node.next;
            node.next.prev = node.prev;
            Node x = node;
            if(val.containsKey(node.val+1)){
                v = val.get(node.val+1);
            }
            else{
                v = new ValNode(node.val+1);
                val.put(node.val+1,v);
                v.prev = tail.prev;
                tail.prev.next = v;
                v.next = tail;
                tail.prev = v;
            }
            x.next = v.head.next;
            x.prev = v.head;
            v.head.next.prev = x;
            v.head.next = x;
            node.val++;
            ValNode vn = val.get(node.val-1);
            if(vn.head.next.next == null){
                set.remove(vn.val);
            }
        }
        else{
            node = new Node(key);
            h.put(key,node);
            if(val.containsKey(1)){
                v = val.get(1);
            }
            else{
                v = new ValNode(1);
                val.put(1,v);
                v.prev = tail.prev;
                tail.prev.next = v;
                v.next = tail;
                tail.prev = v;
            }
            node.next = v.head.next;
            node.prev = v.head;
            v.head.next.prev = node;
            v.head.next = node;
        }
        
        set.add(node.val);
    }
    
    public void dec(String key) {
        Node node = h.get(key);
        if(node.val == 1){
            node.prev.next = node.next;
            node.next.prev = node.prev;
            h.remove(key);
        }
        else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
            ValNode v = val.get(node.val-1);
            node.next = v.head.next;
            node.prev = v.head;
            v.head.next.prev = node;
            v.head.next = node;
        }
        ValNode vn = val.get(node.val);
        if(vn.head.next.next == null){
            set.remove(vn.val);
        } 
        node.val--;
        if(node.val>0) set.add(node.val);
    }
    
    public String getMaxKey() {
        if(!set.isEmpty()){
            int x = set.last();
            System.out.println("Max - "+x);
            ValNode v = val.get(x);
            System.out.println("Max - "+v.val);
            return v.head.next.s;
        }
        return "";
    }
    
    public String getMinKey() {
        if(!set.isEmpty()){
            int x = set.first();
            System.out.println("Min - "+x);
            ValNode v = val.get(x);
            System.out.println("Min - "+v.val);
            return v.head.next.s;
        }
        return "";
    }
}
