package leetCode.easy;

import java.util.ArrayList;

public class L0_LinkedListImplementation{

    class Node{
        int val;
        Node next;

        Node (int val){
            this. val = val;}
    }

    class LinkedList {
        private Node head;
        private Node tail;

        public LinkedList() {
            this.head = new Node(-1);
            this.tail = this.head;
        }

        public int get(int index) {
            Node curr = this.head.next;
            for (int i = 0; i<=index; i++){
                if (curr == null) return -1;
                curr = curr.next;
            }
            return curr.val;
        }

        public void insertHead(int val) {
            Node new_node = new Node(val);
            new_node.next = this.head.next;
            this.head.next = new_node;

            if (tail.next == null){
                this.tail = new_node;
            }

        }

        public void insertTail(int val) {
            Node new_node = new Node(val);
            this.tail.next = new_node;
            this.tail = new_node;


            Node curr = this.head.next;
            while (curr.next != null){
                curr = curr.next;
            }
        }

        public boolean remove(int index) {
            int i = 0;
            Node curr = this.head;
            while (i < index && curr != null) {
                i++;
                curr = curr.next;
            }

            // Remove the node ahead of curr
            if (curr != null && curr.next != null) {
                if (curr.next == this.tail) {
                    this.tail = curr;
                }
                curr.next = curr.next.next;
                return true;
            }
            return false;
        }

        public ArrayList<Integer> getValues() {
            ArrayList<Integer> ans = new ArrayList<>();
            if (this.head.next == null){
                ans.add(-1);
            }
            Node curr = this.head.next;
            while (curr != null){
                ans.add(curr.val);
                curr = curr.next;
            }

            return ans;
        }

        public int returnTailValue(){
            if (head.next == null){
                return -1;
            }
            Node curr = this.head.next;
            while (curr.next != null){
                curr = curr.next;
            }
            return curr.val;
        }

    }
}
