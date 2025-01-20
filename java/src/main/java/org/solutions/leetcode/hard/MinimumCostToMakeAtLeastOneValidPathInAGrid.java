package org.solutions.leetcode.hard;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * <a href="https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid">1368. Minimum Cost to Make at Least One Valid Path in a Grid</a>
 */

public class MinimumCostToMakeAtLeastOneValidPathInAGrid {
    public int minCost(int[][] grid) {
        int right = 1;
        int left = 2;
        int down = 3;
        int up = 4;
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        for (int[] row : visited) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Deque<int[]> deque = new ArrayDeque<>();
        deque.addFirst(new int[]{0, 0, 0});

        while (!deque.isEmpty()) {
            var cell = deque.pollFirst();
            int i = cell[0];
            int j = cell[1];
            int cost = cell[2];

            if (i == n - 1 && j == m - 1) {
                return cost;
            }

            if (j < m - 1) {
                int newCost = (grid[i][j] == right) ? cost : cost + 1;
                if (newCost < visited[i][j + 1]) {
                    visited[i][j + 1] = newCost;
                    if (grid[i][j] == right) {
                        deque.addFirst(new int[]{i, j + 1, newCost});
                    } else {
                        deque.addLast(new int[]{i, j + 1, newCost});
                    }
                }
            }

            if (j > 0) {
                int newCost = (grid[i][j] == left) ? cost : cost + 1;
                if (newCost < visited[i][j - 1]) {
                    visited[i][j - 1] = newCost;
                    if (grid[i][j] == left) {
                        deque.addFirst(new int[]{i, j - 1, newCost});
                    } else {
                        deque.addLast(new int[]{i, j - 1, newCost});
                    }
                }
            }

            if (i < n - 1) {
                int newCost = (grid[i][j] == down) ? cost : cost + 1;
                if (newCost < visited[i + 1][j]) {
                    visited[i + 1][j] = newCost;
                    if (grid[i][j] == down) {
                        deque.addFirst(new int[]{i + 1, j, newCost});
                    } else {
                        deque.addLast(new int[]{i + 1, j, newCost});
                    }
                }
            }

            if (i > 0) {
                int newCost = (grid[i][j] == up) ? cost : cost + 1;
                if (newCost < visited[i - 1][j]) {
                    visited[i - 1][j] = newCost;
                    if (grid[i][j] == up) {
                        deque.addFirst(new int[]{i - 1, j, newCost});
                    } else {
                        deque.addLast(new int[]{i - 1, j, newCost});
                    }
                }
            }
        }

        return -1;
    }
}
