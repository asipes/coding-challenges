package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/special-array-i">3151. Special Array I</a>
 */

public class SpecialArrayI {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int x = nums[i - 1] % 2;
            int y = nums[i] % 2;

            if (x == y || (x != 0 && y != 0) ) {
                return false;
            }
        }

        return true;
    }

    public boolean isArraySpecialV2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i - 1] + nums[i]) % 2 == 0) {
                return false;
            }
        }

        return true;
    }
}
