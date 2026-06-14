//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
package com.testds.leetcode.problems.maximumPairSumInLinkedList;

import com.testds.leetcode.utils.ListNode;

public class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        int[] arr = new int[100_000];
        int size = 0;
        while (slow != null) {
            arr[size++] = slow.val;
            slow = slow.next;
        }
        int max = 0, local;
        for (int i = 0; i < size / 2; i++) {
            local = arr[i] + arr[size - i - 1];
            if (local > max) {
                max = local;
            }
        }
        System.gc();
        return max;
    }
}
