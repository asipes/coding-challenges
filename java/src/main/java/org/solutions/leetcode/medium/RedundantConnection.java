package org.solutions.leetcode.medium;

import org.model.DSU;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/redundant-connection">684. Redundant Connection</a>
 */

@SuppressWarnings("SuspiciousNameCombination")
public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int n = 0;

        for (int[] edge : edges) {
            n = Math.max(n, Math.max(edge[0], edge[1]));
        }

        var dsu = new DSU(n + 1);
        List<int[]> result = new ArrayList<>();

        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];

            if (dsu.find(x) == dsu.find(y)) {
                result.add(edge);
            } else {
                dsu.union(x, y);
            }
        }

        return result.getLast();
    }
}
