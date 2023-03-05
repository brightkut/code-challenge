package leetcode.linked_list.remove_link_list_203;

import leetcode.common.ListNode;
import leetcode.common.TreeNode;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;

        ListNode res = new ListNode(-1);
        res.next = head;

        ListNode current = res;

        while (current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }

        return res.next;
    }
}
