package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindAllNumbersDisappearedInAnArrayTest {

    public static Stream<Arguments> provideFindDisappearedNumbersTestCsers() {
        return Stream.of(
                Arguments.of(new int[]{4,3,2,7,8,2,3,1}, List.of(5,6)),
                Arguments.of(new int[]{1,1}, List.of(2))
        );
    }

    @ParameterizedTest
    @MethodSource("provideFindDisappearedNumbersTestCsers")
    void findDisappearedNumbers(int[] nums, List<Integer> expected) {
        var actual = new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(nums);

        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}