package leetcode.linked_list.intersection_two_link_list_160;

import leetcode.common.ListNode;

import java.util.HashSet;

public class Main {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode s1 = headA;
        ListNode s2 = headB;


        while (s1 != s2){
            s1 = s1 == null ? headB : s1.next;
            s2 = s2 == null ? headA : s2.next;
        }

        return s1;
    }
}
