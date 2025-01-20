package org.solutions.leetcode.easy;

import org.model.TreeNode;

/**
 * <a href="https://leetcode.com/problems/sum-of-left-leaves/">404. Sum of Left Leaves: 0ms(100%), 41.26mb(79.56%)</a>
 */

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    private int sumOfLeftLeaves(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null && isLeft) {
            return node.val;
        }

        return sumOfLeftLeaves(node.left, true) + sumOfLeftLeaves(node.right, false);
    }
}
