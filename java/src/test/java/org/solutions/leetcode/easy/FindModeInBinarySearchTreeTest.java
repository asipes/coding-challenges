package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.model.TreeNode;
import org.providers.TreeProvider;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindModeInBinarySearchTreeTest {

    public static Stream<Arguments> provideFindModeTestCases() {
        return Stream.of(
                Arguments.of(new Integer[]{1,null,2,2}, new int[]{2}),
                Arguments.of(new Integer[]{0}, new int[]{0})
        );
    }

    @ParameterizedTest
    @MethodSource("provideFindModeTestCases")
    void findMode(Integer[] input, int[] expected) {
        TreeNode root = TreeProvider.buildBST(input);
        var actual = new FindModeInBinarySearchTree().findMode(root);

        assertArrayEquals(expected, actual);
    }
}