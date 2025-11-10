package leetCode.easy;

public class L24_LL_RemoveElement {

    public ListNode removeElements(ListNode head, int val) {
        //dummy node attached to head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = head;
        ListNode prev = dummy;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next; // skip the current node
            } else {
                prev = curr; // only advance prev when we keep the node
            }
            curr = curr.next; // always advance curr
        }

        return dummy.next;
    }
}
