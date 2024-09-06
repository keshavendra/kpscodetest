//https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/
package com.testds.leetcode.problems.modifiedList;

import com.testds.leetcode.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = convertToSet(nums);
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            if (set.contains(temp.val)) {
                //remove node
                if (prev == null) {
                    //meaning head
                    head = temp.next;
                } else {
                    prev.next = temp.next;
                }
            } else {
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }

    private Set<Integer> convertToSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set;
    }
}
