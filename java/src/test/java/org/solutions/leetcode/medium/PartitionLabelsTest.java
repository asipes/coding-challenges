package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartitionLabelsTest {

    public static Stream<Arguments> providePartitionLabelsTestCases() {
        return Stream.of(
                Arguments.of("ababcbacadefegdehijhklij", List.of(9, 7, 8)),
                Arguments.of("eccbbbbdec", List.of(10))
        );
    }

    @ParameterizedTest
    @MethodSource("providePartitionLabelsTestCases")
    void partitionLabels(String s, List<Integer> expected) {
        var actual = new PartitionLabels().partitionLabels(s);
        assertEquals(expected, actual);
    }
}