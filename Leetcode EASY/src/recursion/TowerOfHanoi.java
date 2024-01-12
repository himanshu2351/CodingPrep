package recursion;

import java.util.ArrayList;

//Problem statement :
//	
//You are given three rods (numbered 1 to 3), and ‘N’ disks initially placed on the first rod, one on top of each other in increasing order of size ( the largest disk is at the bottom). You are supposed to move the ‘N’ disks to another rod(either rod 2 or rod 3) using the following rules and in less than 2 ^ (N) moves.
//
//1. You can only move one disk in one move. 
//2. You can not place a larger disk on top of a smaller disk.
//3. You can only move the disk at the top of any rod.    
//Note :
//You may assume that initially, the size of the ‘i’th disk from the top of the stack is equal to ‘i’, i.e. the disk at the bottom has size ‘N’, the disk above that has size ‘N - 1’, and so on. The disk at the top has size 1.
//
//Sample Input 1 :
//2
//1
//2
//
//Sample Output 1 :
//1
//1

public class TowerOfHanoi {
	
	public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        //    Write your code here.
        int s = 1;
        int h = 2;
        int d = 3;
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        toh(n,s,h,d,al);

        return al;
        
    }

    public static void toh(int n, int s, int h ,int d, ArrayList<ArrayList<Integer>> al){
        if(n<=0) {
            return;
        }

        toh(n-1,s,d,h,al);
        ArrayList<Integer> arr = new ArrayList<>();
         arr.add(s);
        arr.add(d);
        al.add(arr);
        toh(n-1,h,s,d,al);

    }
}
