package org.solutions.leetcode.hard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/making-a-large-island">827. Making A Large Island</a>
 */

public class MakingALargeIsland {
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int n;
    private int maxSize = 0;

    public int largestIsland(int[][] grid) {
        n = grid.length;
        Map<Integer, Integer> islands = new HashMap<>();
        int id = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int size = dfs(grid, i, j, id);
                    maxSize = Math.max(maxSize, size);
                    islands.put(id, size);
                    id++;
                }
            }
        }

        boolean hasZero = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    hasZero = true;
                    int size = 1;
                    Set<Integer> islandIds = new HashSet<>();

                    for (int[] direction : DIRECTIONS) {
                        int x = i + direction[0];
                        int y = j + direction[1];

                        if (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] > 1) {
                            islandIds.add(grid[x][y]);
                        }
                    }

                    for (Integer islandId : islandIds) {
                        size += islands.get(islandId);
                    }

                    maxSize = Math.max(maxSize, size);
                }
            }
        }

        return hasZero ? maxSize : n * n;
    }

    private int dfs(int[][] grid, int row, int col, int id) {
        if (row < 0 || row >= n || col < 0 || col >= n || grid[row][col] != 1) {
            return 0;
        }
        grid[row][col] = id;
        int size = 1;

        for (int[] direction : DIRECTIONS) {
            size += dfs(grid, row + direction[0], col + direction[1], id);
        }

        return size;
    }
}
