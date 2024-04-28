package linkedList;

//Problem Statement :
//
//Design and implement a data structure for a Least Frequently Used (LFU) cache.
//
//Implement the LFUCache class:
//
//LFUCache(int capacity) Initializes the object with the capacity of the data structure.
//int get(int key) Gets the value of the key if the key exists in the cache. Otherwise, returns -1.
//void put(int key, int value) Update the value of the key if present, or inserts the key if not already present. When the cache reaches its capacity, it should invalidate and remove the least frequently used key before inserting a new item. For this problem, when there is a tie (i.e., two or more keys with the same frequency), the least recently used key would be invalidated.
//To determine the least frequently used key, a use counter is maintained for each key in the cache. The key with the smallest use counter is the least frequently used key.
//
//When a key is first inserted into the cache, its use counter is set to 1 (due to the put operation). The use counter for a key in the cache is incremented either a get or put operation is called on it.
//
//The functions get and put must each run in O(1) average time complexity.
//
//Example 1:
//
//Input
//["LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get", "get"]
//[[2], [1, 1], [2, 2], [1], [3, 3], [2], [3], [4, 4], [1], [3], [4]]
//Output
//[null, null, null, 1, null, -1, 3, null, -1, 3, 4]


import java.util.*;

class LfuList{
    int val;
    int count;
    int key;

    LfuList next;
    LfuList prev;

    public LfuList(int key,int val){
        this.val = val;
        count = 1;
        this.key = key;
    }
}

class LFUCache {
    HashMap<Integer,LfuList> h;
    TreeMap<Integer,ArrayList<LfuList>> m;
    int size;
    int min = 0;
    LfuList node;
    public LFUCache(int capacity) {
        h = new HashMap<>();
        m = new TreeMap<>();
        size = capacity;
    }
    
    public int get(int key) {
        if(h.containsKey(key)){
            LfuList item = h.get(key);
            m.get(item.count).remove(item);
            if(m.get(item.count).size()==0){
                m.remove(item.count);
            }
            if(m.containsKey(item.count+1)){
                m.get(item.count+1).add(item);
            }
            else{
                m.put(item.count+1,new ArrayList<LfuList>(){{add(item);}});
            }
            h.get(key).count++;
            return h.get(key).val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(h.containsKey(key)){
            LfuList item = h.get(key);
            m.get(item.count).remove(item);
            if(m.get(item.count).size()==0){
                m.remove(item.count);
            }
            if(m.containsKey(item.count+1)){
                m.get(item.count+1).add(item);
            }
            else{
                m.put(item.count+1,new ArrayList<LfuList>(){{add(item);}});
            }
            item.count++;
            item.val = value;
        }
        else{
            if(size == 0){
                Integer lowestKey = m.firstKey();
                LfuList rem = m.get(lowestKey).remove(0);
                h.remove(rem.key);
                size++;
            }
            size--;
            LfuList item = new LfuList(key,value);
            h.put(key,item);
            if(m.containsKey(item.count)){
                m.get(item.count).add(item);
            }
            else{
                m.put(item.count,new ArrayList<LfuList>(){{add(item);}});
            }
        }
        

    }
}