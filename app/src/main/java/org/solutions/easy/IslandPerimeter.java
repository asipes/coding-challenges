package org.solutions.easy;

/**
 * <a href="https://leetcode.com/problems/island-perimeter/">463. Island Perimeter: 4ms(99.87%), 46.20mb(16.95%)</a>
 */

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter  = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;

                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;
                    }

                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }
}
