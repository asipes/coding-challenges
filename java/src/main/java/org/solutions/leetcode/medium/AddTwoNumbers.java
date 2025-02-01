package org.solutions.leetcode.medium;

import org.model.ListNode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/add-two-numbers">2. Add Two Numbers</a>
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int temp = 0;

        while (l1 != null || l2 != null || temp != 0) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;

            int sum = num1 + num2 + temp;
            int target = sum % 10;
            temp = sum / 10;

            cur.next = new ListNode(target);
            cur = cur.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return dummy.next;
    }

    public ListNode addTwoNumbersV2(ListNode l1, ListNode l2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        calculateList(l1, list1);
        calculateList(l2, list2);

        int idx1 = list1.size() - 1;
        int idx2 = list2.size() - 1;
        int temp = 0;

        List<Integer> result = new ArrayList<>();

        while (idx1 >= 0 && idx2 >= 0) {
            int num = list1.get(idx1) + list2.get(idx2) + temp;
            int target = num % 10;
            temp = num / 10;
            result.add(target);
            idx1--;
            idx2--;
        }

        for (int i = idx1; i >= 0; i--) {
            int num = list1.get(i) + temp;
            int target = num % 10;
            temp = num / 10;
            result.add(target);
        }

        for (int i = idx2; i >= 0; i--) {
            int num = list2.get(i) + temp;
            int target = num % 10;
            temp = num / 10;
            result.add(target);
        }

        if (temp > 0) {
            result.add(temp);
        }

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        for (int i = 0; i < result.size(); i++) {
            dummy.next = new ListNode(result.get(i));
            dummy = dummy.next;
        }

        return head.next;
    }

    private void calculateList(ListNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        calculateList(node.next, list);
        list.add(node.val);
    }

    public ListNode addTwoNumbersV1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        BigDecimal num1 = calculateNumber(l1);
        BigDecimal num2 = calculateNumber(l2);

        return createNode(num1.add(num2));
    }

    private BigDecimal calculateNumber(ListNode node) {
        if (node == null) {
            return BigDecimal.ZERO;
        }

        var sum = calculateNumber(node.next).multiply(BigDecimal.TEN);
        return new BigDecimal(node.val).add(sum);
    }

    private ListNode createNode(BigDecimal num) {
        if (num.compareTo(BigDecimal.TEN) < 0) {
            return new ListNode((num.intValue()));
        }

        int val = num.remainder(BigDecimal.TEN).intValue();
        ListNode listNode = new ListNode(val);
        listNode.next = createNode(num.divideToIntegralValue(BigDecimal.TEN));

        return listNode;
    }
}
