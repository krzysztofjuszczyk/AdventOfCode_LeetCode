package hackerrank.days30ofCode;

import java.util.HashSet;

public class d24_LinkedList_RemoveDuplicates {
    public static Node removeDuplicates(Node head) {
        //Write your code here
        if (head == null) return null;
        Node cur = head;
        Node prev = head;
        HashSet<Integer> set = new HashSet<>();
        while (cur != null){
            //   System.out.println(prev.data + " " + cur.data);
            if (!set.contains(cur.data)){
                //   System.out.println("add");
                set.add(cur.data);
                prev = cur;
                cur = cur.next;
            } else {
                //   System.out.println("already");
                prev.next = cur.next;
                cur = cur.next;
            }
        }
        return head;
    }


    // works only on sorted nodes in non-decreasing order
    public static Node removeDuplicates2(Node head) {
        //Write your code here
        Node start = head;

        while (start.next != null) {
            if (start.data == start.next.data) {
                start.next = start.next.next;
            } else {
                start = start.next;
            }
        }
        return head;
    }


    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }
}
