package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FindUniqueBinaryStringTest {

    public static Stream<Arguments> provideFindDifferentBinaryStringTestCases() {
        return Stream.of(
                Arguments.of(new String[] {"01","10"}, Set.of("00", "11")),
                Arguments.of(new String[] {"00","01"}, Set.of("10", "11")),
                Arguments.of(new String[] {"111","011","001"}, Set.of("000", "010", "100", "101", "110"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideFindDifferentBinaryStringTestCases")
    void findDifferentBinaryString(String[] nums, Set<String> expected) {
        var actual = new FindUniqueBinaryString().findDifferentBinaryString(nums);
        assertTrue(expected.contains(actual));
    }
}