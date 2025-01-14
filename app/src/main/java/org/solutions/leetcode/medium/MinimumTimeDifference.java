package org.solutions.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/minimum-time-difference">539. Minimum Time Difference</a>
 */

public class MinimumTimeDifference {
        public int findMinDifference(List<String> timePoints) {
            List<String> mutableTimePoints = new ArrayList<>(timePoints);
            mutableTimePoints.sort(String::compareTo);
            int n = mutableTimePoints.size();


            int minDiff = Integer.MAX_VALUE;

            for (int i = 0; i < n - 1; i++) {
                int minutes1 = toMinutes(mutableTimePoints.get(i));
                int minutes2 = toMinutes(mutableTimePoints.get(i + 1));
                int diff = Math.abs(minutes1 - minutes2);

                minDiff = Math.min(minDiff, diff);
            }

            int first = toMinutes(mutableTimePoints.get(0));
            int last = toMinutes(mutableTimePoints.get(n - 1));
            int diffAcrossMidnight = 1440 - Math.abs(last - first);

            return Math.min(minDiff, diffAcrossMidnight);
        }

        private int toMinutes(String time) {
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);

            return hours * 60 + minutes;
        }
}
