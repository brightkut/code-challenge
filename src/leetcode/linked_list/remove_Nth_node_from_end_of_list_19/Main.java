package leetcode.linked_list.remove_Nth_node_from_end_of_list_19;

import leetcode.common.ListNode;

public class Main {
    public static void main(String[] args) {

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
}
