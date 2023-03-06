package leetcode.linked_list.swap_node_in_pair_24;

import leetcode.common.ListNode;

public class Main {
    public static void main(String[] args) {

    }

    // Do by myself; O(n) n = number of node
    public ListNode swapPairs(ListNode head) {
        if( head == null || head.next == null) return head;

        ListNode res = new ListNode(-1);

        ListNode result = res;

        ListNode head2 = head;

        ListNode prev = null;

        int c= 1;

        while(head2 != null){

            ListNode next = null;
            if(c==1){
                prev = head2;
                next = head2.next;
            }else if (c==2){
                //swap
                next = head2.next;

                head2.next = prev;
                prev.next = null;
                res.next = head2;
                res = prev;
                prev = null;
                c = 0;
            }

            head2 = next;

            c++;
        }

        if(prev != null) res.next = prev;

        return result.next;

    }
}
