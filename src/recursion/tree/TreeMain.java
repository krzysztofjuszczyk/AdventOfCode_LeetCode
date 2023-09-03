package recursion.tree;

import java.util.List;

public class TreeMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(100,80,50,90,30,60,90,85,95,120,110,108,115,140,150);
        TreeNode root = null;
        for (int val :
                list) {
            root = insertNode(root,val);
        }
        printLeaves(root);
    }


    public static TreeNode insertNode (TreeNode root, int val)
    {
        if (root == null){
            TreeNode newNode = new TreeNode(val);
            return newNode;
        }
        if (val > root.val){
            insertNode(root.right, val);
        }
        else insertNode(root.left, val);
        return root;
    }

    public static void printLeaves(TreeNode root){
        if (root == null) return;
        if (root.left == null && root.right == null) System.out.println(root.val + ", ");
        if (root.left != null) printLeaves(root.left);
        if (root.right != null) printLeaves(root.right);
    }
}
