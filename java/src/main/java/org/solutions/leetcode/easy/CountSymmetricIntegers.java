package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/count-symmetric-integers">2843. Count Symmetric Integers</a>
 */

public class CountSymmetricIntegers {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String currentNumber = Integer.toString(i);
            int length = currentNumber.length();

            if (length % 2 != 0) {
                continue;
            }

            int mid = length / 2;
            int leftSum = sum(currentNumber.substring(0, mid));
            int rightSum = sum(currentNumber.substring(mid));

            if (leftSum == rightSum) {
                count++;
            }
        }
        return count;
    }

    private int sum(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i) - '0';
        }
        return sum;
    }
}
