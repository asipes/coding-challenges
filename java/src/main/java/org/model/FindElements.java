package org.model;

/**
 * <a href="https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree">1261. Find Elements in a Contaminated Binary Tree</a>
 */

public class FindElements {
    private final TreeNode root;

    public FindElements(TreeNode root) {
        this.root = root;
        clear(root, 0);
    }

    public boolean find(int target) {
        return find(target, root);
    }

    private boolean find(int target, TreeNode node) {
        if (node == null) {
            return false;
        }
        if (node.val == target) {
            return true;
        }

        return find(target, node.left) || find(target, node.right);
    }

    private void clear(TreeNode node, int val) {
        if (node == null) {
            return;
        }

        node.val = val;
        clear(node.left, val * 2 + 1);
        clear(node.right, val * 2 + 2);
    }
}
