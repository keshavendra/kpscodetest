//https://leetcode.com/problems/merge-in-between-linked-lists/
package com.testds.leetcode.problems.mergeInBetweenList;

import com.testds.leetcode.utils.ListNode;

public class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int nodeNumCounter = a - 1;
        ListNode nodePreviousToA = list1;
        ListNode nodeNextToB = list1;
        while (nodeNumCounter > 0) {
            nodePreviousToA = nodePreviousToA.next;
            nodeNextToB = nodeNextToB.next;
            nodeNumCounter--;
        }
        nodeNumCounter = b - a + 1;
        while (nodeNumCounter >= 0) {
            nodeNextToB = nodeNextToB.next;
            nodeNumCounter--;
        }
        ListNode lastNodeOfList2 = list2;
        while (lastNodeOfList2.next != null) {
            lastNodeOfList2 = lastNodeOfList2.next;
        }

        nodePreviousToA.next = list2;
        lastNodeOfList2.next = nodeNextToB;
        return list1;
    }
}
