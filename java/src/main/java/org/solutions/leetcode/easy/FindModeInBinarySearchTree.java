package org.solutions.leetcode.easy;

import org.model.TreeNode;

import java.util.*;

public class FindModeInBinarySearchTree {
    private final Map<Integer, Integer> freq = new HashMap<>();
    private int currentVal = -1;
    private int currentFreq = 0;
    private int maxFreq = 0;
    private final Set<Integer> result = new HashSet<>();


    public int[] findMode(TreeNode root) {
        inOrderTraversal(root);

        return result.stream().mapToInt(i -> i).toArray();
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left);

        currentFreq = node.val == currentVal ? currentFreq + 1 : 1;

        if (currentFreq == maxFreq) {
            result.add(node.val);
        } else if (currentFreq > maxFreq) {
            maxFreq = currentFreq;
            result.clear();
            result.add(node.val);
        }

        currentVal = node.val;

        inOrderTraversal(node.right);
    }

    public int[] findModeV1(TreeNode root) {
        dfs(root);

        int max = freq.values().stream().mapToInt(n -> n).max().orElse(0);

        return freq.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        dfs(node.left);
        freq.put(node.val, freq.getOrDefault(node.val, 0) + 1);
        dfs(node.right);
    }
}
