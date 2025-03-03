package org.solutions.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/partition-array-according-to-given-pivot">2161. Partition Array According to Given Pivot</a>
 */

public class PartitionArrayAccordingToGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lows = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> highs = new ArrayList<>();

        for (int j : nums) {
            if (j < pivot) {
                lows.add(j);
            } else if (j > pivot) {
                highs.add(j);
            } else {
                mid.add(j);
            }
        }

        int index = 0;

        for (int num : lows) {
            nums[index++] = num;
        }

        for (int num : mid) {
            nums[index++] = num;
        }

        for (int num : highs) {
            nums[index++] = num;
        }

        return nums;
    }
}
