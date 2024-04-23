package hackerrank.days30ofCode;

import java.util.LinkedList;

public class d23_BST_levelOrderTraversal {
    static void levelOrder(Node root){
        //Write your code here
        LinkedList<Node> treeQueue = new LinkedList();
        treeQueue.add(root);
        while (!treeQueue.isEmpty()){
            Node toprint = treeQueue.remove();
            System.out.print(toprint.data);
            if(toprint.left != null) {
                treeQueue.add(toprint.left);
            }
            if(toprint.right != null) {
                treeQueue.add(toprint.right);
            }
            if(treeQueue.peek() != null) {
                System.out.print(" ");
            }
        }
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    }
