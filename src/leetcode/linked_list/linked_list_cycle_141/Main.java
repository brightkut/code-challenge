package leetcode.linked_list.linked_list_cycle_141;

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
}
