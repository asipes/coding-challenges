package org.solutions.easy;

/**
 * <a href="https://leetcode.com/problems/third-maximum-number/">414. Third Maximum Number: 1ms(97.89%), 43.11mb(53.94%)</a>
 */

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        boolean minValueExist = false;

        for (int num : nums) {
            if (num == Integer.MIN_VALUE) {
                minValueExist = true;
            }
            if (num == max1 || num == max2 || num == max3) {
                continue;
            }

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        if (max3 > Integer.MIN_VALUE || minValueExist && max2 > Integer.MIN_VALUE) {
            max1 = max3;
        }

        return max1;
    }
}
