package org.solutions.leetcode.easy;

import org.model.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class FindModeInBinarySearchTree {
    Map<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
        dfs(root);

        int max = map.values().stream().mapToInt(n -> n).max().orElse(0);

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        dfs(node.left);
        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        dfs(node.right);
    }
}
