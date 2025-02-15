package org.solutions.leetcode.medium;

/**
 * <a href="https://leetcode.com/problems/find-the-punishment-number-of-an-integer">2698. Find the Punishment Number of an Integer</a>
 */

public class FindThePunishmentNumberOfAnInteger {
    public int punishmentNumber(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (isEquals(square, i, 0)) {
                result += square;
            }
        }

        return result;
    }

    private boolean isEquals(int num, int target, int current) {
        if (num == 0) {
            return current == target;
        }

        int part = 0;
        int factor = 1;

        while (num > 0) {
            int last = num % 10;
            part = part + last * factor;
            factor *= 10;
            num /= 10;

            if (current + part > target) {
                break;
            }

            if (isEquals(num, target, current + part)) {
                return true;
            }
        }

        return false;
    }
}
