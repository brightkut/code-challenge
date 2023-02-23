package leetcode.linked_list.reverse_linked_list_206;

import leetcode.common.ListNode;

public class Main {
    public static void main(String[] args) {

    }

    //pass
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode l = null;

        ListNode s = head;

        while(s!=null){
            ListNode next = s.next;
            s.next = l;
            l  = s;
            s = next;
        }

        return l;
    }
}
