package leetCode.easy;

import leetCode.TreeNode;

public class L2236_RootEqualsSumOfChildren {
    public boolean checkTree(TreeNode root) {
        return (root.left.val + root.right.val == root.val);

    }
}
