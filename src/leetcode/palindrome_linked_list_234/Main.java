package leetcode.palindrome_linked_list_234;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(ListNode head) {
        ListNode h = head;

        ListNode n = null;

        while (h.next!=null){
            //create new node
            ListNode l = new ListNode(h.val);
            l.next = n;

            n = l;

        }

        return h == n;
    }
}
