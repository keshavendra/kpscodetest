//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
package com.testds.leetcode.problems.removeNthFromEnd;


import com.testds.leetcode.utils.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        for (int i = 1; i <= n; i++) {
            temp = temp.next;
        }

        ListNode nMinusOneNode = null;
        while (temp != null) {
            if (nMinusOneNode == null) {
                nMinusOneNode = head;
            } else {
                nMinusOneNode = nMinusOneNode.next;
            }
            temp = temp.next;
        }
        if (nMinusOneNode == null) {
            //we need to remove the head itself
            assert head != null;
            head = head.next;
        } else {
            nMinusOneNode.next = nMinusOneNode.next.next;
        }
        return head;
    }
}
