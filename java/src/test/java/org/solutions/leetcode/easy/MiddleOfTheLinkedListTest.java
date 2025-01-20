package org.solutions.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.model.ListNode;
import org.providers.ListNodeProvider;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleOfTheLinkedListTest {

    @Test
    void middleNode() {
        ListNode head = ListNodeProvider.buildList(new ArrayList<>(List.of(1, 2, 3, 4, 5)));
        ListNode node = new MiddleOfTheLinkedList().middleNode(head);

        assertEquals(3, node.val);
    }
}