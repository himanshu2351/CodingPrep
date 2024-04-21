package linkedList;

//Problem Statement :
//
//You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//
//Merge all the linked-lists into one sorted linked-list and return it.
//
//Example 1:
//
//Input: lists = [[1,4,5],[1,3,4],[2,6]]
//Output: [1,1,2,3,4,4,5,6]

public class MergeSortedLists {
	public LinkedListNode<Integer> mergeKLists(LinkedListNode<Integer>[] lists) {
        if (lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];
        int sum = 0;
        for (LinkedListNode<Integer> x : lists) {
            LinkedListNode<Integer> curr = x;
            while (curr != null) {
                sum++;
                curr = curr.next;
            }
        }
        LinkedListNode<Integer> ans = new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> ansEnd = ans;
        // ans.next = ansEnd;
        for (int i = 0; i < sum; i++) {
            int indx = -1;
            int val = Integer.MAX_VALUE;
            for (int j = 0; j < lists.length; j++) {
                if(lists[j]!=null){
                    if(lists[j].data<val){
                        val = lists[j].data;
                        indx = j;
                    }
                }
            }
            if(indx!=-1){
                LinkedListNode<Integer> curr = lists[indx];
                lists[indx] = lists[indx].next;
                ansEnd.next = curr;
                ansEnd = ansEnd.next;
            }
        }
        return ans.next;
    }
}
