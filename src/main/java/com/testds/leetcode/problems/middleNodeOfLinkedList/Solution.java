//https://leetcode.com/problems/middle-of-the-linked-list/

package com.testds.leetcode.problems.middleNodeOfLinkedList;

import com.testds.leetcode.utils.ListNode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode tortoise = head;
        ListNode rabbit = head;
        while (rabbit.next != null) {
            rabbit = rabbit.next;
            if (rabbit.next != null)
                rabbit = rabbit.next;
            if (tortoise.next != null)
                tortoise = tortoise.next;
        }
        return tortoise;
    }
}
