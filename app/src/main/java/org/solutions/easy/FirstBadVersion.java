package org.solutions.easy;

import org.model.VersionControl;

/**
 * <a href="https://leetcode.com/problems/first-bad-version/">...</a>
 * 25 ms - beats 71.11
 * 40.16 mb - beats 78.49%
 */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2; // безопасное вычисление от переполнения инта
            if (!isBadVersion(mid)) { // если проверять на true вначале, то работает менее эффективно с тесткейсами литкода
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return Math.min(low, n);
    }
}
