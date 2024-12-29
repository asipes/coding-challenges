package org.solutions.leetcode.easy;

import org.model.TreeNode;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/minimum-absolute-difference-in-bst">530. Minimum Absolute Difference in BST: 0ms(100.00%), 45.07(5.91%)</a>
 */

public class MinimumAbsoluteDifferenceInBST {
    public int getMinimumDifference(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        int prev = root.val;
        int diff = Integer.MAX_VALUE;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current =  stack.pop();

            if (prev != current.val) {
                int currentDiff = Math.abs(prev - current.val);
                diff = Math.min(diff, currentDiff);
            }
            prev = current.val;

            current = current.right;
        }

        return diff;
    }
}
