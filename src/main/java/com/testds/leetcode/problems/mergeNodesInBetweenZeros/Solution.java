//https://leetcode.com/problems/merge-nodes-in-between-zeros/
package com.testds.leetcode.problems.mergeNodesInBetweenZeros;


import com.testds.leetcode.utils.ListNode;

public class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode listHead = null, lastNodeOfList = null;
        int sum = 0;
        head = head.next;
        while (head != null) {
            if (head.val == 0) {
                ListNode newNode = new ListNode(sum);
                if (listHead == null) {
                    listHead = newNode;
                    lastNodeOfList = newNode;
                } else {
                    lastNodeOfList.next = newNode;
                    lastNodeOfList = newNode;
                }
                sum = 0;
            } else {
                sum += head.val;
            }
            head = head.next;
        }
        return listHead;
    }
}
