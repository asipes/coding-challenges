package org.solutions.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-watch">401. Binary Watch</a>
 */

public class BinaryWatch {
    public List<String> readBinaryWatch(int turnedOn) {
        if (turnedOn > 8) return List.of();

        List<String> res = new ArrayList<>();

        List<List<Integer>> hourGroups = new ArrayList<>();
        List<List<Integer>> minuteGroups = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            hourGroups.add(new ArrayList<>());
        }
        for (int i = 0; i <= 6; i++) {
            minuteGroups.add(new ArrayList<>());
        }

        for (int i = 0; i <= 11; i++) {
            hourGroups.get(Integer.bitCount(i)).add(i);
        }
        for (int i = 0; i <= 59; i++) {
            minuteGroups.get(Integer.bitCount(i)).add(i);
        }

        for (int i = 0; i <= Math.min(turnedOn, 4); i++) {
            int turnOnWithoutHour = turnedOn - i;
            if (turnOnWithoutHour >= 0 && turnOnWithoutHour <= 6) {
                for (int hour : hourGroups.get(i)) {
                    for (int minute : minuteGroups.get(turnOnWithoutHour)) {
                        res.add(String.format("%d:%02d", hour, minute));
                    }
                }
            }
        }

        return res;
    }
}
