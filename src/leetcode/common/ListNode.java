package leetcode.common;

import java.util.StringJoiner;

public class ListNode {
      public int val;
      public ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public String traverse(){
            StringJoiner res = new StringJoiner(",");
            ListNode temp = next;

            while (temp != null){
                  res.add(String.valueOf(temp.val));
                  temp = temp.next;
            }

            return res.toString();
      }
}
