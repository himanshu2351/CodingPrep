package linkedList;

//Problem Statement :
//
//Design a HashMap without using any built-in hash table libraries.
//
//Implement the MyHashMap class:
//
//MyHashMap() initializes the object with an empty map.
//void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
//int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
//void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
// 
//Example 1:
//
//Input
//["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
//[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
//Output
//[null, null, null, 1, -1, null, 1, null, -1]

class HashNode{
    int key;
    int hash;
    int val;

    HashNode next = null;

    public HashNode(int key, int val){
        this.key = key;
        this.val = val;
    }
}
class DesignHashMap {

    HashNode[] arr;
    public DesignHashMap() {
        arr = new HashNode[10000];
    }
    
    public void put(int key, int value) {
        int h = hash(key);
        if(arr[h]!=null){
            HashNode t = arr[h];
            HashNode prev = null;
            while(t!=null && t.key!=key){
                prev = t;
                t = t.next;
            }
            if(t==null){
                HashNode n = new HashNode(key,value);
                n.hash = h;
                prev.next = n;
            }
            else{
                t.val = value;
            }
        }
        else{
            HashNode n = new HashNode(key,value);
            n.hash = h; 
            arr[h] = n;
        }
    }
    
    public int get(int key) {
        int h = hash(key);
        if(arr[h]!=null){
            HashNode t = arr[h];
            HashNode prev = null;
            while(t!=null && t.key!=key){
                prev = t;
                t = t.next;
            }
            if(t==null){
                return -1;
            }
            else{
                return t.val;
            }
        }
        else{
            return -1;
        }
    }
    
    public void remove(int key) {
        int h = hash(key);
        if(arr[h]!=null){
            HashNode t = arr[h];
            HashNode prev = null;
            while(t!=null && t.key!=key){
                prev = t;
                t = t.next;
            }
            if(t==null){
                return;
            }
            else if(arr[h] == t){
                arr[h] = t.next;
            }
            else{
                prev.next = t.next;
                t.next = null;
            }
        }
    }

    private int hash(int key){
        return key%arr.length;
    }
}

