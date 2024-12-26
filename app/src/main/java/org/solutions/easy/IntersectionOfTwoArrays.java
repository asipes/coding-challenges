package org.solutions.easy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays/submissions">...</a>
 *  6 ms - beats 13.71%
 *  43.47 mb - beats 36.22%
 */

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums2).filter(set::contains).distinct().toArray();
    }
}
