package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/add-digits">258. Add Digits</a>
 */

public class AddDigits {
    public int addDigits(int num) {
        while (num > 9) {
            int temp = 0;

            while (num > 9) {
                temp += num % 10;
                num /= 10;
            }

            num += temp;
        }

        return num;
    }
}
