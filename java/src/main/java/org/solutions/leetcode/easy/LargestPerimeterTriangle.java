package org.solutions.leetcode.easy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/largest-perimeter-triangle">976. Largest Perimeter Triangle</a>
 */

public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 1; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }
}
