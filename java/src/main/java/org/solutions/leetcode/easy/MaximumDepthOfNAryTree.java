package org.solutions.leetcode.easy;

import org.model.Node;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfNAryTree {
    public int maxDepth(Node root) {
        Queue<Node> searchQueue = new LinkedList<>();

        searchQueue.add(root);
        int count = 0;

        while (!searchQueue.isEmpty()) {
            count++;
            int size = searchQueue.size();

            for (int i = 0; i < size; i++) {
                Node node = searchQueue.poll();

                if (node != null && node.children == null) {
                    continue;
                }
                if (node != null) {
                    searchQueue.addAll(node.children);
                }
            }
        }
        return count;
    }
}
