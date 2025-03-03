package org.solutions.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/partition-array-according-to-given-pivot">2161. Partition Array According to Given Pivot</a>
 */

public class PartitionArrayAccordingToGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> highs = new ArrayList<>();

        int index = 0;
        int pivotCount = 0;

        for (int j : nums) {
            if (j < pivot) {
                nums[index++] = j;
            } else if (j > pivot) {
                highs.add(j);
            } else {
                pivotCount++;
            }
        }

        for (int i = 0; i < pivotCount; i++) {
            nums[index++] = pivot;
        }

        for (int num : highs) {
            nums[index++] = num;
        }

        return nums;
    }
}
