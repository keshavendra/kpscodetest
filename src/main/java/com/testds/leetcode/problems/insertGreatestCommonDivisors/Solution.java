//https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
package com.testds.leetcode.problems.insertGreatestCommonDivisors;

import com.testds.leetcode.utils.ListNode;

public class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (!lengthLessThan2(head)) {
            ListNode prev = head;
            ListNode curr = head.next;
            while (curr != null) {
                int gcd = findGCD(Math.min(prev.val, curr.val), Math.max(prev.val, curr.val));
                ListNode newNode = new ListNode(gcd);
                prev.next = newNode;
                newNode.next = curr;
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    private int findGCD(int small, int big) {
        if (small == 0)
            return big;
        if (big == 0)
            return small;

        if (big % small == 0)
            return small;

        int diff = big - small;
        int tmpSmall = small;
        small = Math.min(tmpSmall, diff);
        big = Math.max(tmpSmall, diff);
        return findGCD(small, big);
    }

    private boolean lengthLessThan2(ListNode head) {
        return head == null || head.next == null;
    }
}
