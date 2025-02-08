package org.solutions.leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * <a href="https://leetcode.com/problems/design-a-number-container-system/submissions">2349. Design a Number Container System</a>
 */

public class NumberContainers {
    private final Map<Integer, Integer> heap;
    private final Map<Integer, TreeSet<Integer>> mapToIndex;

    public NumberContainers() {
        heap = new HashMap<>();
        mapToIndex = new HashMap<>();
    }

    public void change(int index, int number) {
        if (heap.containsKey(index)) {
            int currentNumber = heap.get(index);
            TreeSet<Integer> indices = mapToIndex.get(currentNumber);
            indices.remove(index);

            if (indices.isEmpty()) {
                mapToIndex.remove(currentNumber);
            }
        }

        heap.put(index, number);
        mapToIndex.computeIfAbsent(number, t -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        return mapToIndex.getOrDefault(number, new TreeSet<>()).isEmpty() ? -1 : mapToIndex.get(number).first();
    }
}
