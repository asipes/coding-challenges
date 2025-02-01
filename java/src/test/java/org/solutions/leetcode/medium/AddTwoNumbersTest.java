package org.solutions.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.model.ListNode;
import org.providers.ListNodeProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {

    public static Stream<Arguments> provideAddTwoNumbersTestCases() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(2,4,3)), new ArrayList<>(List.of(5,6,4)), 708),
                Arguments.of(new ArrayList<>(List.of(0)), new ArrayList<>(List.of(0)), 0),
                Arguments.of(new ArrayList<>(List.of(9,9,9,9,9,9,9)), new ArrayList<>(List.of(9,9,9,9)), 89990001),
                Arguments.of(new ArrayList<>(List.of(9)), new ArrayList<>(List.of(1,9,9,9,9,9,9,9,9,9)), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideAddTwoNumbersTestCases")
    void addTwoNumbers(List<Integer> source1, List<Integer> source2, long expected) {
        ListNode l1 = ListNodeProvider.buildList(source1);
        ListNode l2 = ListNodeProvider.buildList(source2);

        var addedNode = new AddTwoNumbers().addTwoNumbers(l1, l2);
        long actual = calculateNumber(addedNode);
        assertEquals(expected, actual);
    }

    private long calculateNumber(ListNode node) {
        long val = 0;
        while (node != null) {
            val *= 10;
            val += node.val;
            node = node.next;
        }

        return val;
    }
}