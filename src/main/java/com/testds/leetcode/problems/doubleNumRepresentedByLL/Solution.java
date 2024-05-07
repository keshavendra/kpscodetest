//https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/
package com.testds.leetcode.problems.doubleNumRepresentedByLL;

import com.testds.leetcode.utils.ListNode;

public class Solution {
    public ListNode doubleIt(ListNode head) {
        int carry = doubleVal(head);
        if (carry != 0) {
            ListNode temp = new ListNode();
            temp.val = carry;
            temp.next = head;
            head = temp;
        }
        return head;
    }

    private int doubleVal(ListNode node) {
        int carry = 0;
        if (node.next != null) {
            carry = doubleVal(node.next);
        }
        int val = node.val * 2 + carry;
        node.val = val % 10;
        return val / 10;
    }
}
