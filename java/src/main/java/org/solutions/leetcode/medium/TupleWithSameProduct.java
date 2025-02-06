package org.solutions.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/tuple-with-same-product">1726. Tuple with Same Product</a>
 */

public class TupleWithSameProduct {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> variants = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                variants.merge(nums[i] * nums[j], 1, Integer::sum);
            }
        }

        int count = 0;

        for (int value : variants.values()) {
            count += value * (value - 1) * 4;
        }

        return count;
    }
}
