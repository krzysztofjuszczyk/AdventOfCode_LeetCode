package hackerrank.days30ofCode;

import java.io.*;
import java.util.*;

public class d15_LinkedList {

        public  Node insert(Node head,int data) {
            //Complete this method
            Node newNode = new Node(data);
            Node current = head;
            if (head== null){
                head = newNode;
                return head;
            }
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
            return head;

        }

        public void display(Node head) {
            Node start = head;
            while(start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

     class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    }

