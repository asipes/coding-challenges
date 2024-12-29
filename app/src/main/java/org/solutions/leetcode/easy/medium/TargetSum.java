package org.solutions.leetcode.easy.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/target-sum">...</a>
 */

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        for (int num : nums) {
            Map<Integer, Integer> current = new HashMap<>();

            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                int add = entry.getKey() + num;
                int subtract = entry.getKey() - num;
                int count = entry.getValue();

                current.put(add, current.getOrDefault(add, 0) + count);
                current.put(subtract, current.getOrDefault(subtract, 0) + count);
            }

            current.forEach((key, value) ->
                    counts.merge(key, value, (v1, v2) -> v2)
            );
        }

        return counts.getOrDefault(target, 0);
    }
}
