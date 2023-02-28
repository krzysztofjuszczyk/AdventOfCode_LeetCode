package leetCode.medium;

public class M2_AddTwoNumbers {
    public static void main(String[] args) {

    }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode();

            int l1num = 0;
            int l2num = 0;
            int rem = 0;
            int n = 1;
            while (l1.next != null){
                l1num = l1.val*n + rem;
                rem = l1num;
                n*= 10;
            }

            rem = 0; n = 1;
            while (l2.next != null){
                l2num = l2.val*n + rem;
                rem = l2num;
                n*= 10;
            }
            System.out.println(l1num+l2num);
            int x = l1num + l2num;

//            while (x>0){
//                int value = x%10;
//                ListNode start = new ListNode(value);
//            }

            return result;
        }

        public class ListNode {
        int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
