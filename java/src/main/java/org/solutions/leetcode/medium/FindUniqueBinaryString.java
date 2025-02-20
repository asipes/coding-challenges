package org.solutions.leetcode.medium;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/find-unique-binary-string">1980. Find Unique Binary String</a>
 */

public class FindUniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        List<String> res = new ArrayList<>();
        generate(n, "", res);

        Set<String> set = new HashSet<>(Arrays.asList(nums));
        for (String num : res) {
            if (!set.contains(num)) {
                return num;
            }
        }

        return "";
    }

    private void generate(int n, String str, List<String> res) {
        if (str.length() == n) {
            res.add(str);
            return;
        }

        generate(n, str + "0", res);
        generate(n, str + "1", res);
    }
}
