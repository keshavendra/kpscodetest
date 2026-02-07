//https://leetcode.com/problems/merge-k-sorted-lists/
package com.testds.leetcode.problems.mergeKSortedLists;


import com.testds.leetcode.utils.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {

    private static final Comparator<ListNodeWithIndex> COMPARATOR = (o1, o2) -> {
        if (o1.node == null && o2.node == null) return 0;
        if (o1.node == null) return -1;
        if (o2.node == null) return 1;
        if (o1.node.val != o2.node.val) {
            return o1.node.val - o2.node.val;
        } else {
            return o1.index - o2.index;
        }
    };

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null, tail = null;
        PriorityQueue<ListNodeWithIndex> pq = new PriorityQueue<>(COMPARATOR);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                ListNodeWithIndex node = new ListNodeWithIndex(i, lists[i]);
                pq.offer(node);
                lists[i] = lists[i].next;
                node.node.next = null;
            }
        }

        while (!pq.isEmpty()) {
            ListNodeWithIndex nodeWithIndex = pq.poll();
            if (tail != null) {
                tail.next = nodeWithIndex.node;
                tail = tail.next;
            } else {
                tail = nodeWithIndex.node;
                head = tail;
            }
            //fetch the next node from the same index
            if (lists[nodeWithIndex.index] != null) {
                nodeWithIndex.node = lists[nodeWithIndex.index];
                lists[nodeWithIndex.index] = lists[nodeWithIndex.index].next;
                nodeWithIndex.node.next = null;
                pq.offer(nodeWithIndex);
            }
        }

        return head;

    }

    private static class ListNodeWithIndex {
        int index;
        ListNode node;

        public ListNodeWithIndex(int index, ListNode node) {
            this.index = index;
            this.node = node;
        }
    }
}