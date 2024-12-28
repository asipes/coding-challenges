package org.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.model.TreeNode;
import org.providers.TreeProvider;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfLeftLeavesTest {

    public static Stream<Arguments> provideSumOfLeftLeavesTestCases() {
        return Stream.of(
                Arguments.of(new Integer[]{3, 9, 20, null, null, 15, 7}, 24),
                Arguments.of(new Integer[]{1}, 0),
                Arguments.of(new Integer[]{1, 2, 3, 4, 5}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSumOfLeftLeavesTestCases")
    void sumOfLeftLeaves(Integer[] nodes, int expected) {
        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();

        TreeNode root = TreeProvider.buildTree(nodes);
        var actual = sumOfLeftLeaves.sumOfLeftLeaves(root);

        assertThat(actual).isEqualTo(expected);
    }
}