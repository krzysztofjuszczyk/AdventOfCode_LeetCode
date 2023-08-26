package leetCode.easy;

import leetCode.TreeNode;

public class L112_PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.right == null && root.left == null) return root.val == targetSum;
        return (hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val));


//            boolean hasLeaves = false;
//            if (root == null) {return false;}
//            int ans = root.val;
//            if (ans == targetSum) {return true;}
//            if (root.left != null || root.right != null) {hasLeaves = true;}
//
//            while (hasLeaves) {
//                //calculate sum
//            }
    }
}
