package leetcode.two_pointer.slow_fast_pointer.linked_list_operation.remove_Nth_node_from_end_of_list_19;

import leetcode.common.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode a5 = new ListNode(5,null);
        ListNode a4 = new ListNode(4,a5);
        ListNode a3 = new ListNode(3,a4);
        ListNode a2 = new ListNode(2,a3);
        ListNode a1 = new ListNode(1,a2);

        removeNthFromEnd2(a1,2);
    }

    //Do by myself O(n)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode reverse = null;

        if(head == null || head.next == null ){
            reverse = head;
        }else {

            ListNode temp = head;

            //Reverse LinkedList
            while( temp != null){
                // temp
                ListNode next = temp.next;

                temp.next = reverse;
                reverse = temp;
                temp = next;
            }
        }

        ListNode res = null;

        int c = 1;

        while(reverse != null){
            ListNode temp = reverse.next;
            if(c!=n){
                reverse.next = res;
                res = reverse;
            }

            reverse = temp;
            c++;
        }

        return res;
    }

    //Do myself
    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        if(head == null ) return null;

        int size = 0;

        ListNode start = head;
        ListNode head2 = head;

        ListNode res = new ListNode(-1);
        ListNode res2 = res;

        while (start != null){
            size++;
            start = start.next;
        }

        int position = size - n + 1;


        int pos = 0;


        while (head2 != null){
            pos++;
            System.out.println("pos:"+ pos + "val: "+ head2.val);
            if(pos == position ){
                if (head2.next == null){
                    res.next = null;
                }
                head2 = head2.next;
                continue;
            }else {
                res.next = head2;
                res = res.next;
            }

            head2 = head2.next;
        }
        System.out.println(res2.next.val);

        return res2.next;
    }

    //two pinter
    public ListNode removeNthFromEnd3(ListNode head, int n){
        //dummy
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = head;

        while (n > 0 && right != null){
            right = right.next;
            n--;
        }

        while (right != null){
            left = left.next;
            right = right.next;
        }

        // delete next pointer
        left.next = left.next.next;

        return dummy.next;
    }
}
