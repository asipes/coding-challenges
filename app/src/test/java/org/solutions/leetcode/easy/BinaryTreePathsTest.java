package org.solutions.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.model.TreeNode;
import org.providers.TreeProvider;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreePathsTest {

    @Test
    void binaryTreePaths() {
        Integer[] arr = {1,2,3,null,5};
        TreeNode root = TreeProvider.buildTree(arr);

        var actual = new BinaryTreePaths().binaryTreePaths(root);

        assertThat(actual).containsExactlyInAnyOrderElementsOf(List.of("1->2->5","1->3"));
    }
}