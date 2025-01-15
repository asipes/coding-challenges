package org.solutions.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/perfect-number">507. Perfect Number</a>
 */

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num < 2) {
            return false;
        }

        int sqrt = (int) Math.sqrt(num);
        Set<Integer> divisors = new HashSet<>();
        divisors.add(1);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                divisors.add(i);
                divisors.add(num / i);
            }
        }

        return divisors.stream().mapToInt(n -> n).sum() == num;
    }
}
