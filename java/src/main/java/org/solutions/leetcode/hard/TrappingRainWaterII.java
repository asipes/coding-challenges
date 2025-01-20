package org.solutions.leetcode.hard;

/**
 * <a href="https://leetcode.com/problems/trapping-rain-water-ii">407. Trapping Rain Water II</a>
 */

public class TrappingRainWaterII {
    public int trapRainWater(int[][] heightMap) {
        int n = heightMap.length;
        int m = heightMap[0].length;

        if (n < 3 || m < 3) return 0;

        int[][] water = new int[n][m];

        for (int i = 0; i < n; i++) {
            water[i][0] = heightMap[i][0];
            water[i][m - 1] = heightMap[i][m - 1];
        }

        for (int j = 0; j < m; j++) {
            water[0][j] = heightMap[0][j];
            water[n - 1][j] = heightMap[n - 1][j];
        }

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                water[i][j] = Integer.MAX_VALUE;
            }
        }

        boolean updated = true;

        while (updated) {
            updated = false;

            for (int i = 1; i < n - 1; i++) {
                for (int j = 1; j < m - 1; j++) {
                    if (water[i][j] < heightMap[i][j]) {
                        continue;
                    }
                    int minNeighbor = Math.min(water[i - 1][j], water[i][j - 1]);
                    int newWaterLevel = Math.max(minNeighbor, heightMap[i][j]);
                    if (newWaterLevel < water[i][j]) {
                        water[i][j] = newWaterLevel;
                        updated = true;
                    }
                }
            }

            for (int i = n - 2; i > 0; i--) {
                for (int j = m - 2; j > 0; j--) {
                    if (water[i][j] < heightMap[i][j]) {
                        continue;
                    }
                    int minNeighbor = Math.min(water[i + 1][j], water[i][j + 1]);
                    int newWaterLevel = Math.max(minNeighbor, heightMap[i][j]);
                    if (newWaterLevel < water[i][j]) {
                        water[i][j] = newWaterLevel;
                        updated = true;
                    }
                }
            }
        }

        int total = 0;

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                total += water[i][j] - heightMap[i][j];
            }
        }

        return total;
    }
}
