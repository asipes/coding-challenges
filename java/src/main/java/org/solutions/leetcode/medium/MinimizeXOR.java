package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/minimize-xor/submissions">2429. Minimize XOR</a>
 */

public class MinimizeXOR {
    public int minimizeXor(int num1, int num2) {
        int targetBitCount = Integer.bitCount(num2);
        int res = num1;
        int bitPosition = 0;
        int currentBitCount = Integer.bitCount(res);

        while (currentBitCount != targetBitCount) {
            if (currentBitCount > targetBitCount) {
                if ((res & (1 << bitPosition)) != 0) {
                    res = res & ~(1 << bitPosition);
                }
            } else {
                if ((res & (1 << bitPosition)) == 0) {
                    res = res | (1 << bitPosition);
                }
            }

            bitPosition++;

            currentBitCount = Integer.bitCount(res);
        }

        return res;
    }
}
