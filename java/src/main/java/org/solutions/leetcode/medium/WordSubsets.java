package org.solutions.leetcode.medium;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <a href="https://leetcode.com/problems/word-subsets">916. Word Subsets</a>
 */

public class WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        Map<Character, Integer> freq = Stream.of(words2)
                .map(word -> word.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                Collectors.summingInt(c -> 1)
                        )))
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        Math::max
                ));

        return Stream.of(words1)
                .filter(word -> isUniversal(word, freq))
                .collect(Collectors.toList());
    }

    private boolean isUniversal(String s, Map<Character, Integer> freq) {
        Map<Character, Integer> wordFreq = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.summingInt(c -> 1)
                ));

        return freq.entrySet().stream()
                .allMatch(entry ->
                        wordFreq.getOrDefault(entry.getKey(), 0) >= entry.getValue());
    }
}
