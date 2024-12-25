package org.solutions;

import org.model.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/">...</a>
 */

public class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {
                TreeNode curr = queue.poll();
                if (curr.val > max) {
                    max = curr.val;
                }

                if (curr.right != null) {
                    queue.add(curr.right);
                }
                if (curr.left != null) {
                    queue.add(curr.left);
                }
            }

            res.add(max);
        }

        return res;
    }
}
