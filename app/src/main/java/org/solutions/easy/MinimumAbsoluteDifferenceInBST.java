package org.solutions.easy;

import org.model.TreeNode;

/**
 * <a href="https://leetcode.com/problems/minimum-absolute-difference-in-bst">530. Minimum Absolute Difference in BST: 0ms(100.00%), 45.07(5.91%)</a>
 */

public class MinimumAbsoluteDifferenceInBST {
    public int getMinimumDifference(TreeNode root) {
        int[] prevAndDiff = {root.val, Integer.MAX_VALUE};
        inOrderTraversal(root, prevAndDiff);
        return prevAndDiff[1];
    }

    private void inOrderTraversal(TreeNode node, int[] prevAndDiff) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left, prevAndDiff);

        if (prevAndDiff[0] != node.val ) {
            int currentDiff = Math.abs(prevAndDiff[0] - node.val);
            prevAndDiff[1] = Math.min(prevAndDiff[1], currentDiff);
        }

        prevAndDiff[0] = node.val;

        inOrderTraversal(node.right, prevAndDiff);
    }
}
