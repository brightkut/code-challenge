package leetcode.two_pointer.slow_fast_pointer.linked_list_operation.linked_list_cycle_141;

import leetcode.common.ListNode;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<>();

        ListNode node = head;

        while(node != null) {

            if(nodes.contains(node)) return true;
            nodes.add(node);
            node = node.next;
        }

        return false;
    }

    //slow and fast pointer
    public boolean hasCycle2(ListNode head){
        if(head == null || head.next == null) return false;

        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next !=null){
            s = s.next;
            f = f.next.next;

            if(s==f){
                return true;
            }
        }

        return false;
    }

    public boolean hasCycle3(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode h = head;

        while (head != null){
            ListNode s = h.next;
            ListNode f = h.next.next;

            if(s==f) return true;

            h = s;
        }

        return false;
    }
}
