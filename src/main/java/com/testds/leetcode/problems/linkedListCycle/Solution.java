//https://leetcode.com/problems/linked-list-cycle/
package com.testds.leetcode.problems.linkedListCycle;

import com.testds.leetcode.utils.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean hasCycle = false;
        if (head == null || head.next == null)
            return false;
        ListNode slowPointer = head, fastPointer = head.next;
        while (fastPointer != null && slowPointer != fastPointer) {
            slowPointer = slowPointer.next;
            if (fastPointer.next == null)
                return false;
            fastPointer = fastPointer.next.next;
        }
        if (fastPointer == slowPointer)
            return true;
        return hasCycle;
    }

    public static ListNode createList(int[] arr, int position) {
        if (position > arr.length)
            throw new RuntimeException("position cannot be greater than number of elements");
        ListNode list = new ListNode();
        ListNode temp = list;
        for (int j : arr) {
            temp.next = new ListNode(j);
            temp = temp.next;
        }
        ListNode startNode = list.next;
        connectToPosition(startNode, position);
        return startNode;
    }

    private static void connectToPosition(ListNode startNode, int position) {
        if (position == -1)
            return;
        ListNode head = startNode;
        ListNode positionNode = startNode;
        int i = 0;
        while (i < position) {
            positionNode = positionNode.next;
            i++;
        }
        while (head.next != null)
            head = head.next;
        head.next = positionNode;

    }
}
