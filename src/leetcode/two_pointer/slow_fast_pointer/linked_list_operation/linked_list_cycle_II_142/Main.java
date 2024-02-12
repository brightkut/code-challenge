package leetcode.two_pointer.slow_fast_pointer.linked_list_operation.linked_list_cycle_II_142;

import leetcode.common.ListNode;

public class Main {

    public static void main(String[] args) {

    }

    //passed
    public ListNode detectCycle(ListNode head) {
        //only1 node
        if(head == null || head.next == null) return null;

        ListNode s = head;
        ListNode f = head;

        boolean isCycle = false;

        //check isCycle
        while (f!= null && f.next != null){
            s = s.next;
            f= f.next.next;

            if(s==f){
                isCycle = true;
                break;
            }
        }

        if(!isCycle) return null;

        ListNode p =head;

        while (p != f){
            p = p.next;
            f = f.next;
            if(p==f){
                return f;
            }
        }

        return p;
    }
}
