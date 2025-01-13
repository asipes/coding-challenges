package org.solutions.leetcode;

import org.junit.jupiter.api.Test;
import org.model.TreeNode;
import org.providers.TreeProvider;
import org.solutions.leetcode.easy.FindLargestValueInEachTreeRow;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindLargestValueInEachTreeRowTest {
    @Test
    void largestValues() {
        Integer[] arr = {1,3,2,5,3,null,9};
        TreeNode root = TreeProvider.buildTree(arr);
        FindLargestValueInEachTreeRow findLargestValueInEachTreeRow = new FindLargestValueInEachTreeRow();
        List<Integer> actual = findLargestValueInEachTreeRow.largestValues(root);
        List<Integer> expected = List.of(1,3,9);
        assertEquals(expected, actual);
    }
}