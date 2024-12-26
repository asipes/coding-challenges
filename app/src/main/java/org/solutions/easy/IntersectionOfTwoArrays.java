package org.solutions.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays/submissions">...</a>
 * 6 ms - beats 13.71% - на 2 ms можно снизить если в конце заполнить массив с ответом вручную
 * 43.27 mb - beats 60.44%
 */

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> res = new ArrayList<>();
        int prev = -1;

        for (int num : nums1) {
            if (num != prev) {
                int low = 0;
                int high = nums2.length - 1;

                while (low <= high) {
                    int mid = low + (high - low) / 2;

                    if (num == nums2[mid]) {
                        res.add(nums2[mid]);
                        break;
                    }

                    if (nums2[mid] > num) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
            prev = num;
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
