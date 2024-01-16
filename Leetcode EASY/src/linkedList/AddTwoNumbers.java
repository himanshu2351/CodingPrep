package linkedList;

public class AddTwoNumbers {
	
	static LinkedListNode<Integer> addTwoNumbers(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        // Write your code here.

		LinkedListNode<Integer> res = new LinkedListNode<Integer>(-1);
		LinkedListNode<Integer> head = res;
        int carry = 0;
        while(head1!=null && head2!=null){
            int s = (head1.data+head2.data+carry)%10;
            carry = (head1.data+head2.data+carry)/10;

            LinkedListNode<Integer> sum = new LinkedListNode<Integer>(s);

            res.next = sum;
            res = sum;

            head1 = head1.next;
            head2 = head2.next;
        }
        if(head1!=null){
            while(head1!=null){
                int s = (head1.data+carry)%10;
                carry = (head1.data+carry)/10;

                LinkedListNode<Integer> sum = new LinkedListNode<Integer>(s);

                res.next = sum;
                res = sum;

                head1 = head1.next;
            }
        }

        if(head2!=null){
            while(head2!=null){
                int s = (head2.data+carry)%10;
                carry = (head2.data+carry)/10;

                LinkedListNode<Integer> sum = new LinkedListNode<Integer>(s);

                res.next = sum;
                res = sum;

                head2 = head2.next;
            }
        }

        if(carry == 1){
            res.next = new LinkedListNode<Integer>(1);
        }

        return head.next;
    }
}
