package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.model.TreeNode;
import org.providers.TreeProvider;
import org.solutions.leetcode.easy.MinimumDistanceBetweenBSTNodes;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumDistanceBetweenBSTNodesTest {

    public static Stream<Arguments> provideMinimumDistanceBetweenBSTNodesTestCases() {
        return Stream.of(
                Arguments.of(new Integer[]{4, 2, 6, 1, 3}, 1),
                Arguments.of(new Integer[]{1, 0, 48, null, null, 12, 49}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinimumDistanceBetweenBSTNodesTestCases")
    void minDiffInBST(Integer[] values, int expected) {
        MinimumDistanceBetweenBSTNodes minimumDistanceBetweenBSTNodes = new MinimumDistanceBetweenBSTNodes();
        TreeNode root = TreeProvider.buildBST(values);
        var actual = minimumDistanceBetweenBSTNodes.minDiffInBST(root);

        assertEquals(expected, actual);
    }
}