package recursion.tree;

import java.util.List;

public class TreeMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(100,80,50,90,30,60,90,85,95,120,110,108,115,140,150);
        TreeNode root = null;
        for (Integer val :
                list) {
            root = insertNode(root,val);
        }
        printLeaves(root);
    }


    public static TreeNode insertNode (TreeNode head, int val)
    {
        if (head == null){
            head = new TreeNode(val);
            return head;
        }
        if (val > head.val){
            head.right = insertNode(head.right, val);
        }
        else head.left = insertNode(head.left, val);
        return head;
    }

    public static void printLeaves(TreeNode root){
        if (root == null) return;
        if (root.left == null && root.right == null) System.out.println(root.val + ", ");
        if (root.left != null) printLeaves(root.left);
        if (root.right != null) printLeaves(root.right);
    }
}
