//https://leetcode.com/problems/reverse-linked-list-ii/
package com.testds.leetcode.problems.revereseLinkedList2;

import com.testds.leetcode.utils.ListNode;

public class Solution2 {
    private static ListNode reverseListNodeFirst;
    private static ListNode reverseListNodeLast;
    private static ListNode remainingListFirstNode = null;

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head,prev=null;
        int count = 1;
        while (count < left) {
            prev = temp;
            temp = temp.next;
            count++;
        }

        reverseList(temp, right - left + 1);

        if (left == 1) {
            head = reverseListNodeFirst;
        } else {
            assert prev != null;
            prev.next = reverseListNodeFirst;
        }

        reverseListNodeLast.next = remainingListFirstNode;
        return head;
    }

    private void reverseList(ListNode head, int i) {
        if (i == 1) {
            remainingListFirstNode = head.next;
            reverseListNodeFirst = head;
            reverseListNodeLast = head;
            return;
        }
        reverseList(head.next, i - 1);
        reverseListNodeLast.next = head;
        reverseListNodeLast = reverseListNodeLast.next;
    }
}
