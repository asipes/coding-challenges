package org.solutions.leetcode.easy;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <a href="https://leetcode.com/problems/find-the-town-judge">997. Find the Town Judge</a>
 */

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n + 1];

        for (int[] t : trust) {
            score[t[0]]--;
            score[t[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (score[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }

    public int findJudgeV2(int n, int[][] trust) {
        Map<Integer, Integer> freq = Arrays.stream(trust)
                .flatMap(t -> Stream.of(
                        new int[]{t[0], -1},
                        new int[]{t[1], 1}))
                .collect(Collectors.toMap(
                        arr -> arr[0],
                        arr -> arr[1],
                        Integer::sum
                ));

        return IntStream.rangeClosed(1, n)
                .filter(i -> freq.getOrDefault(i, 0) == n - 1)
                .findFirst()
                .orElse(-1);
    }

    public int findJudgeV1(int n, int[][] trust) {
        int candidate = 1;

        for (int i = 2; i <= n; i++) {
            if (trusts(candidate, i, trust)) {
                candidate = i;
            }
        }

        if (isJudge(candidate, n, trust)) {
            return candidate;
        }

        return -1;
    }

    private boolean isJudge(int candidate, int n, int[][] trust) {
        int count = 0;

        for (int[] trustRow : trust) {
            if (trustRow[0] == candidate) {
                return false;
            } else if (trustRow[1] == candidate) {
                count++;
            }
        }


        return count == n - 1;
    }

    private boolean trusts(int a, int b, int[][] trust) {
        for (int[] t : trust) {
            if (t[0] == a && t[1] == b) {
                return true;
            }
        }

        return false;
    }
}
