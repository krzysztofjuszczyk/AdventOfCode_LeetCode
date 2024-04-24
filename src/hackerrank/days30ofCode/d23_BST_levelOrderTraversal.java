package hackerrank.days30ofCode;

import java.util.LinkedList;

public class d23_BST_levelOrderTraversal {

    public static void main(String[] args) {
        Node n = new Node(4);
        insert(n,2);
        insert(n,6);
        insert(n,1);
        insert(n,3);
        insert(n,5);
        insert(n,7);

        levelOrder(n);
        // 4 2 6 1 3 5 7
    }

    static void levelOrder(Node root){
        LinkedList<Node> treeQ = new LinkedList();
        treeQ.add(root);

        while (!treeQ.isEmpty()){
            Node top = treeQ.remove();
            System.out.print(top.data + " ");

            if (top.left != null){
                treeQ.add(top.left);
                // System.out.println(top.left + " ");
            }
            if (top.right != null){
                treeQ.add(top.right);
                // System.out.println(top.right + " ");
            }
        }

    }

    static void inOrder(Node root){
        
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
