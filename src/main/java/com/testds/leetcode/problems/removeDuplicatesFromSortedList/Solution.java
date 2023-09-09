//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package com.testds.leetcode.problems.removeDuplicatesFromSortedList;

import com.testds.leetcode.utils.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head;
        if (prev == null)
            return head;
        ListNode temp = prev.next;
        while (temp != null) {
            if (prev.val == temp.val) {
                prev.next = temp.next;
                temp.next = null;
            } else {
                prev = temp;
            }
            temp = prev.next;
        }
        return head;
    }
}
