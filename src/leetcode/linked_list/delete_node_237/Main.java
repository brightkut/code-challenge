package leetcode.linked_list.delete_node_237;

import leetcode.common.ListNode;

public class Main {
    public static void main(String[] args) {

    }

    public static void deleteNode(ListNode node) {
        ListNode nextNode = node.next;

        node.val = nextNode.val;
        node.next = nextNode.next;
        nextNode.next = null;
    }
}
