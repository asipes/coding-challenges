package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/construct-the-lexicographically-largest-valid-sequence">1718. Construct the Lexicographically Largest Valid Sequence</a>
 */

public class ConstructTheLexicographicallyLargestValidSequence {
    public int[] constructDistancedSequence(int n) {
        int[] result = new int[2 * n - 1];
        boolean[] visited = new boolean[n + 1];

        constructArray(result, visited, 0, n);
        return result;
    }

    private boolean constructArray(int[] result, boolean[] visited, int index, int n) {
        if (index == result.length) {
            return true;
        }

        if (result[index] != 0) {
            return constructArray(result, visited, index + 1, n);
        }

        for (int num = n; num >= 1; num--) {
            if (visited[num]) {
                continue;
            }

            int secondIndex = num == 1 ? index : index + num;
            if (secondIndex < result.length && result[secondIndex] == 0) {
                result[index] = num;
                result[secondIndex] = num;
                visited[num] = true;

                if (constructArray(result, visited, index + 1, n)) {
                    return true;
                }

                result[index] = result[secondIndex] = 0;
                visited[num] = false;
            }
        }

        return false;
    }
}
