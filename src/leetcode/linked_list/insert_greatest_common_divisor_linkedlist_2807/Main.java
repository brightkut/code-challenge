package leetcode.linked_list.insert_greatest_common_divisor_linkedlist_2807;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(getGreatestDivisorNode(new ListNode(4),new ListNode(8)).val);
//        System.out.println(getGreatestDivisorNode(new ListNode(18),new ListNode(6)).val);
//        System.out.println(getGreatestDivisorNode(new ListNode(10),new ListNode(3)).val);
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode r = new ListNode();
        ListNode res = r;
        ListNode h = head;


        while(h.next == null){
            ListNode d = getGreatestDivisorNode(h, h.next);
            ListNode next = h.next;
            h.next = d;
            r.next = h;
            r = d.next;
            h = next;
        }
        r.next = h;

        return res.next;
    }

    public static ListNode getGreatestDivisorNode(ListNode f , ListNode s){
        int d = 1;

        int r = 2;

        int min = Math.min(f.val, s.val);

        int f1 = f.val;
        int f2 = s.val;

        while (r <= min){
            if(f1%r==0 && f2 %r == 0) {
                d*=r;
                f1 = f1/r;
                f2 = f2/r;
            }
            else r++;
        }

        return new ListNode(d);
    }
}
