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

    public static ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode h = null;
        ListNode s = head;

        while (s != null){
            ListNode temp = s.next;
            s.next = h;
            h = s;
            s = temp;
        }

        return h;
    }
}
