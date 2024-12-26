package org.solutions.easy;

import org.junit.jupiter.api.Test;
import org.model.TreeNode;
import org.providers.TreeProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;


class InvertBinaryTreeTest {

    @Test
    void invertTree() {
        Integer[] arrSource = {4,2,7,1,3,6,9};
        TreeNode root = TreeProvider.buildTree(arrSource);

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        var actual = invertBinaryTree.invertTree(root);

        Integer[] arrExpected = {4,7,2,9,6,3,1};
        var expected = TreeProvider.buildTree(arrExpected);

        assertEquals(expected, actual);
    }
}