//https://leetcode.com/problems/swap-nodes-in-pairs/
package com.testds.leetcode.problems.swapNodesInPairs;

import com.testds.leetcode.utils.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        //first check if list has more than 2 nodes
        if (head != null && head.next != null) {
            //swap head and its next one first;
            ListNode temp = head.next;
            head.next = temp.next;
            temp.next = head;
            head = temp;

            if (head.next.next != null) {
                ListNode prev = head.next;
                ListNode firstNode = prev.next;
                ListNode secondNode = firstNode.next;
                while (firstNode != null && secondNode != null) {
                    firstNode.next = secondNode.next;
                    secondNode.next = firstNode;
                    prev.next = secondNode;

                    prev = firstNode;
                    firstNode = firstNode.next;
                    secondNode = firstNode == null ? null : firstNode.next;
                }
            }
        }
        return head;
    }
}
