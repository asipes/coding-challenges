package org.solutions.leetcode.easy;

import org.model.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/palindrome-linked-list/">...</a>
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> result = new ArrayList<>();

        while (head != null) {
            result.add(head.val);
            head = head.next;
        }

        return result.equals(result.reversed());
    }
}
