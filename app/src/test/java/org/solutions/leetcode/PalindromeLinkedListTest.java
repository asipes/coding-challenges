package org.solutions.leetcode;

import org.junit.jupiter.api.Test;
import org.model.ListNode;
import org.solutions.leetcode.easy.PalindromeLinkedList;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    @Test
    void isPalindrome() {
        ListNode n4 = new ListNode(1);
        ListNode n3 = new ListNode(1, n4);
        ListNode n2 = new ListNode(1, n3);
        ListNode n1 = new ListNode(1, n2);

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean answer = palindromeLinkedList.isPalindrome(n1);

        assertTrue(answer);
    }
}