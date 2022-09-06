package leetcode.linked_list.merged_two_sort_list_21;

import leetcode.common.ListNode;

public class Main {
    public static void main(String[] args) {
//        list1 = [1,2,4], list2 = [1,3,4]

        ListNode l4 = new ListNode(4);
        ListNode l2 = new ListNode(2);
        l2.next = l4;
        ListNode l1 = new ListNode(1);
        l1.next = l2;


        ListNode list4 = new ListNode(4);
        ListNode list3 = new ListNode(3);
        list3.next = list4;
        ListNode list1 =new ListNode(1);
        list1.next = list3;

        System.out.println(mergeTwoLists(l1,list1).traverse());
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();

        //need head because res will change every time to be next node we need to mark reference of first node to head
        ListNode head = res;
//      list1 = [1,2,4], list2 = [1,3,4]
        // this loop will traverse all node in list1 or list2
        // so we need to have if condition for check list1 and list that didn't be traversed
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                res.next = list1;
                list1 = list1.next;
            }else {
                res.next = list2;
                list2 = list2.next;
            }

            // go to next node
            res = res.next;
        }

        if(list1 != null){
            res.next = list1;
        }else if(list2 != null){
            res.next = list2;
        }

        return head.next;
    }
}
