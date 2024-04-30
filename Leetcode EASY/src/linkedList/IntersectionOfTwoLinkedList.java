package linkedList;

//Problem Statement :
//
//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
//
//For example, the following two linked lists begin to intersect at node c1:
//The test cases are generated such that there are no cycles anywhere in the entire linked structure.
//Note that the linked lists must retain their original structure after the function returns.
//
//Custom Judge:
//
//The inputs to the judge are given as follows (your program is not given these inputs):
//
//intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
//listA - The first linked list.
//listB - The second linked list.
//skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
//skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
//The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.
//
//Example 1:
//
//Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
//Output: Intersected at '8'

public class IntersectionOfTwoLinkedList {
	public LinkedListNode<Integer> getIntersectionNode(LinkedListNode<Integer> headA, LinkedListNode<Integer> headB) {
        if(headA == null || headB == null) return null;

        LinkedListNode<Integer> a = headA, b = headB;
        int x = 0, y= 0;
        while(a!=null){
            x++;
            a=a.next;
        }
        while(b!=null){
            y++;
            b = b.next;
        }

        while(x>y){
            headA = headA.next;
            x--;
        }
        while(y>x){
            y--;
            headB = headB.next;
        }

        while(headA != null && headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;

        // Set<LinkedListNode<Integer>> s = new HashSet<>();
        // while(headA!=null){
        //     s.add(headA);
        //     headA = headA.next;
        // }
        // while(headB!=null){
        //     boolean bool = s.add(headB);
        //     if(bool == false){
        //         return headB;
        //     }
        //     headB = headB.next;
        // }
        // return null;
    }
}
