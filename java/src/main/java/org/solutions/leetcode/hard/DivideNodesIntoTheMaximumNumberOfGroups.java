package org.solutions.leetcode.hard;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/divide-nodes-into-the-maximum-number-of-groups">2493. Divide Nodes Into the Maximum Number of Groups</a>
 */

public class DivideNodesIntoTheMaximumNumberOfGroups {
    List<List<Integer>> graph = new ArrayList<>();
    int[] groups;

    public int magnificentSets(int n, int[][] edges) {
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        groups = new int[n + 1];
        Arrays.fill(groups, -1);

        int maxGroups = 0;
        for (int i = 1; i <= n; i++) {
            if (groups[i] == -1) {
                List<Integer> component = new ArrayList<>();
                if (!isBipolar(i, component)) {
                    return -1;
                }
                maxGroups += getMaxGroupDeep(component);
            }
        }
        return maxGroups;
    }

    private int getMaxGroupDeep(List<Integer> component) {
        int maxDepth = 0;
        for (int node : component) {
            maxDepth = Math.max(maxDepth, bfs(node));
        }
        return maxDepth;
    }

    private int bfs(int start) {
        Queue<Integer> heap = new LinkedList<>();
        Map<Integer, Integer> deep = new HashMap<>();
        heap.add(start);
        deep.put(start, 1);
        int max = 1;

        while (!heap.isEmpty()) {
            int node = heap.poll();
            int currentDeep = deep.get(node);

            for (int neighbor : graph.get(node)) {
                if (!deep.containsKey(neighbor)) {
                    deep.put(neighbor, currentDeep + 1);
                    max = Math.max(max, currentDeep + 1);
                    heap.add(neighbor);
                }
            }
        }
        return max;
    }

    private boolean isBipolar(int start, List<Integer> component) {
        Queue<Integer> heap = new LinkedList<>();
        heap.add(start);
        groups[start] = 0;

        while (!heap.isEmpty()) {
            int node = heap.poll();
            component.add(node);

            for (int neighbor : graph.get(node)) {
                if (groups[neighbor] == -1) {
                    groups[neighbor] = 1 - groups[node];
                    heap.add(neighbor);
                } else if (groups[neighbor] == groups[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}
