package org.solutions.leetcode.easy;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.com/problems/find-the-encrypted-string">3210. Find the Encrypted String</a>
 */

public class FindTheEncryptedString {
    public String getEncryptedString(String s, int k) {
        return IntStream.range(0, s.length())
                .mapToObj(i -> String.valueOf(s.charAt((i + k) % s.length())))
                .collect(Collectors.joining());
    }

    public String getEncryptedStringV2(String s, int k) {
        int n = s.length();
        var sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(s.charAt((i + k) % n));
        }

        return sb.toString();
    }
}
