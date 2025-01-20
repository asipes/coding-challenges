package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/first-completely-painted-row-or-column">2661. First Completely Painted Row or Column</a>
 */
public class FirstCompletelyPaintedRowOrColumn {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int rowCount = mat.length;
        int colCount = mat[0].length;

        int[][] freq = new int[rowCount * colCount][2];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                freq[mat[i][j] - 1][0] = i;
                freq[mat[i][j] - 1][1] = j;
            }
        }

        int[] rowTotal = new int[rowCount];
        int[] colTotal = new int[colCount];

        for (int i = 0; i < arr.length; i++) {
            int row = freq[arr[i] - 1][0];
            int col = freq[arr[i] - 1][1];

            rowTotal[row]++;
            colTotal[col]++;

            if (rowTotal[row] == colCount || colTotal[col] == rowCount) {
                return i;
            }
        }

        return -1;
    }
}
