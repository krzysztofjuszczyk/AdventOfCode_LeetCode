package leetCode.easy;

public class L21_MergeTwoSortedLinkedLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null && l2 == null) {return null  ;}
            if (l1 == null){return l2;}
            if (l2 == null) {return l1;}

            ListNode dummyNode  = new ListNode(0);
            ListNode prev = dummyNode;
            while (l1 != null && l2 != null){

                if (l1.val <= l2.val){
                    prev.next = l1;
                    l1 = l1.next;
                }
                else {
                    prev.next = l2;
                    l2 = l2.next;
                }
                prev = prev.next;

            }
            // when we reached the finish of one LinkeList it is enough to add one node from remaining list
            if (l1 == null){
                prev.next = l2;
            }
            else {
                prev.next = l1;
            }

            return dummyNode.next;

        }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

        if (list1 == null && list2 != null){return list2;}
        if (list1 != null && list2 == null){return list1;}

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }
            else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
            //end of one of the lists

        }
        if (list1 == null){current.next = list2;}
        else {current.next = list1;}
        return dummy.next;
    }



     private class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
