package org.solutions.leetcode.easy;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/unique-number-of-occurrences">1207. Unique Number of Occurrences</a>
 */

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.merge(num, 1, Integer::sum);
        }

        return freq.size() == new HashSet<>(freq.values()).size();
    }

    public boolean uniqueOccurrencesV2(int[] arr) {
        Map<Integer, Long> freq = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));

        return freq.size() == new HashSet<>(freq.values()).size();
    }

    public boolean uniqueOccurrencesV1(int[] arr) {

        return Arrays.stream(arr)
                .boxed()
                .collect(new UniqueOccurrencesCollector());
    }

    static class UniqueOccurrencesCollector implements Collector<Integer, Map<Integer, Long>, Boolean> {

        @Override
        public Supplier<Map<Integer, Long>> supplier() {
            return HashMap::new;
        }

        @Override
        public BiConsumer<Map<Integer, Long>, Integer> accumulator() {
            return (map, value) -> map.merge(value, 1L, Long::sum);
        }

        @Override
        public BinaryOperator<Map<Integer, Long>> combiner() {
            return (map1, map2) -> {
                for (Map.Entry<Integer, Long> entry : map1.entrySet()) {
                    map1.merge(entry.getKey(), entry.getValue(), Long::sum);
                }
                return map1;
            };
        }

        @Override
        public Function<Map<Integer, Long>, Boolean> finisher() {
            return map -> {
                Collection<Long> values = map.values();
                return values.size() == new HashSet<>(values).size();
            };
        }

        @Override
        public Set<Characteristics> characteristics() {
            return Set.of();
        }
    }
}
