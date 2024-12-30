package org.solutions.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.model.Node;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class MaximumDepthOfNAryTreeTest {

    @Test
    void maxDepth() {
        var node5 = new Node(5);
        var node6 = new Node(6);
        var node4 = new Node(4);
        var node3 = new Node(3, List.of(node5, node6));
        var node2 = new Node(2);
        var node1 = new Node(1, List.of(node2, node3, node4));

        MaximumDepthOfNAryTree maximumDepthOfNAryTree = new MaximumDepthOfNAryTree();
        var actual = maximumDepthOfNAryTree.maxDepth(node1);

        assertEquals(3, actual);

    }
}