package org.solutions.leetcode.easy;

import java.util.List;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array">448. Find All Numbers Disappeared in an Array</a>
 */

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            int idx = Math.abs(nums[i]) - 1;
            nums[idx] = -Math.abs(nums[idx]);
        }


        return IntStream.range(0, n)
                .filter(i -> nums[i] > 0)
                .map(i -> i + 1)
                .boxed()
                .toList();
    }
}
