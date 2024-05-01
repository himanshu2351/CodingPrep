package linkedList;

import java.util.HashMap;

//Problem Statement :
//
//Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
//
//Implement the LRUCache class:
//
//LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
//int get(int key) Return the value of the key if the key exists, otherwise return -1.
//void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
//The functions get and put must each run in O(1) average time complexity.
//
//Example 1:
//
//Input
//["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
//[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
//Output
//[null, null, null, 1, null, -1, null, -1, 3, 4]

class LruNode{
	int key;
	int value;
	LruNode prev = null;
	LruNode next = null;

	public LruNode(int key,int value){
		this.key = key;
		this.value = value;
	}
}

public class LRUCache {
	HashMap<Integer,LruNode> h;
	int size;
	LruNode head = null;
	LruNode tail = null;
	public LRUCache(int capacity) {
		head = new LruNode(-1,-1);
		tail = new LruNode(-1,-1);
		head.next = tail;
		tail.prev = head;
		size = capacity;
		h = new HashMap<>();
	}

	public int get(int key) {
		if(h.containsKey(key)){
			LruNode node = h.get(key);
			node.prev.next = node.next;
			node.next.prev = node.prev;
			node.next = head.next;
			head.next.prev = node;
			head.next = node;
			node.prev = head;
			h.put(key,node);
			return node.value;
		}
		return -1;
	}

	public void put(int key, int value) {
		if(h.containsKey(key)){
			h.get(key).value = value;
			get(key);
		}
		else{
			if(size==0){
				LruNode n = h.remove(tail.prev.key);
				n.prev.next = n.next;
				n.next.prev = n.prev;
				size++;
			}
			size--;
			LruNode node = new LruNode(key,value);
			h.put(key,node);
			node.next = head.next;
			head.next.prev = node;
			head.next = node;
			node.prev = head;
		}
	}
}
