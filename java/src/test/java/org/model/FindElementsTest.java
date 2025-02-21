package org.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.providers.TreeProvider;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FindElementsTest {

    public static Stream<Arguments> provideFindTestCases() {
        return Stream.of(
                Arguments.of()
        );
    }

    @ParameterizedTest
    @MethodSource("provideFindTestCases")
    void find() {
        TreeNode treeNode = TreeProvider.buildTree(new Integer[]{-1, -1, -1, -1, -1, -1, -1});
        var actual = new FindElements(treeNode);
        assertTrue(actual.find(1));
        assertTrue(actual.find(3));
        assertTrue(actual.find(5));
    }
}