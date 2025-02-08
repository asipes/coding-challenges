package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/minimum-number-of-operations-to-convert-time">2224. Minimum Number of Operations to Convert Time</a>
 */

public class MinimumNumberOfOperationsToConvertTime {
    public int convertTime(String current, String correct) {
        int currentMinute = Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3, 5));
        int correctMinute = Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3, 5));
        int[] commands = new int[]{60, 15, 5, 1};
        int idx = 0;
        int count = 0;

        while (currentMinute != correctMinute) {
            while (currentMinute + commands[idx] > correctMinute && commands[idx] != 1) {
                idx++;
            }

            currentMinute += commands[idx];
            count++;
        }

        return count;
    }
}
