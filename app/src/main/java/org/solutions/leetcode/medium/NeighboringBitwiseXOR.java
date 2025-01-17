package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/neighboring-bitwise-xor">2683. Neighboring Bitwise XOR</a>
 */

public class NeighboringBitwiseXOR {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;

        for (int n : derived) {
            xor ^= n;
        }

        return xor == 0;
    }
}
