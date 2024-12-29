package org.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.model.TreeNode;
import org.providers.TreeProvider;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumAbsoluteDifferenceInBSTTest {

    public static Stream<Arguments> provideMinimumAbsoluteDifferenceInBSTTestCases() {
        return Stream.of(
                Arguments.of(new Integer[]{4, 2, 6, 1, 3}, 1),
                Arguments.of(new Integer[]{1, 0, 48, null, null, 12, 49}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideMinimumAbsoluteDifferenceInBSTTestCases")
    void getMinimumDifference(Integer[] values, int expected) {
        MinimumAbsoluteDifferenceInBST minimumAbsoluteDifferenceInBST = new MinimumAbsoluteDifferenceInBST();
        TreeNode root = TreeProvider.buildBST(values);
        int actual = minimumAbsoluteDifferenceInBST.getMinimumDifference(root);

        assertEquals(expected, actual);
    }
}