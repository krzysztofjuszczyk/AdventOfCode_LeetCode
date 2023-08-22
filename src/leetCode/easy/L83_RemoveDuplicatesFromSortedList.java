package leetCode.easy;

import leetCode.ListNode;

public class L83_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode current = head;
        ListNode next = current.next;

        while (next != null){
            if (next.val != current.val){
                current.next = next;
                current = next;
            }
               else { current.next = null;}

                next = next.next;

        }
        return head;
    }
}

