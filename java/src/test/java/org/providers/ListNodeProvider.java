package org.providers;

import org.model.ListNode;

import java.util.Collections;
import java.util.List;

public class ListNodeProvider {
    public static ListNode buildList(List<Integer> source) {
        Collections.reverse(source);

        return source.stream()
                .reduce(null, (ListNode head, Integer val) -> {
                    ListNode newNode = new ListNode(val);
                    newNode.next = head;
                    return newNode;
                }, (a, b) -> a);
    }
}
