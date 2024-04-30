package linkedList;

//Problem Statement :
//
//You are given the head of a linked list containing unique integer values and an integer array nums that is a subset of the linked list values.
//Return the number of connected components in nums where two values are connected if they appear consecutively in the linked list.
//
//Example 1:
//
//Input: head = [0,1,2,3], nums = [0,1,3]
//Output: 2

public class LinkedListComponents {
	public int numComponents(LinkedListNode<Integer> head, int[] nums) {
        if(head == null) return 0;

        boolean[] n = new boolean[10001];

        for(int x : nums){
            n[x] = true;
        }
        int count = 0;
        LinkedListNode<Integer> curr = head;
        while(curr!=null){
            if(!n[curr.data]){
                curr = curr.next;
                continue;
            }

            while(curr!=null && n[curr.data]){
                curr = curr.next;
            }
            count++;
        }
        return count;
        
        
        // LinkedListNode<Integer> curr = head;
        // while(curr!=null){
        //     int i = 0;
        //     for(;i<nums.length;i++){
        //         if(curr.data == nums[i]){
        //             break;
        //         }
        //     }
        //     if(i==nums.length) curr.data = -1;
        //     curr = curr.next;
        // }

        // curr = head;
        // int count = 0;
        // while(curr!=null){
        //     if(count == 0 && curr.data == -1){
        //         curr = curr.next;
        //         continue;
        //     }
        //     if(curr.data!=-1){
        //         count++;
        //         while(curr!=null && curr.data!=-1){
        //             curr=curr.next;
        //         }
        //         continue;
        //     }
        //     curr = curr.next;
        // }
        // return count;
    }
}
