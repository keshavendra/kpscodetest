//https://leetcode.com/problems/reorder-list/
package com.testds.leetcode.problems.reorderLinkedList;

import com.testds.leetcode.utils.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public void reorderList(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        while (head != null) {
            deque.add(head);
            head = head.next;
        }

        head = deque.pollFirst();
        while (!deque.isEmpty()) {
            assert head != null;
            head.next = deque.pollLast();
            head = head.next;
            if (!deque.isEmpty()) {
                head.next = deque.pollFirst();
            } else {
                break;
            }
            head = head.next;
        }
        assert head != null;
        head.next = null;
    }
}
