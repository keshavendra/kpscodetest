//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list
package com.testds.leetcode.problems.deleteMiddleFromLinkedList;

import com.testds.leetcode.utils.ListNode;

public class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev == null) {
            head = head.next;
        } else {
            prev.next = slow.next;
        }
        return head;
    }
}
