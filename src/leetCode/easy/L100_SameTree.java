package leetCode.easy;

import leetCode.TreeNode;

public class L100_SameTree {
    // recursion
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;

        // only 1 is null
        else if (p==null || q == null) return false;
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
