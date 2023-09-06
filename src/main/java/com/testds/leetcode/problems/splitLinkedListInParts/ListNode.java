package com.testds.leetcode.problems.splitLinkedListInParts;

import java.util.stream.IntStream;

public class ListNode {
    int val;
    ListNode next;

    @Deprecated
    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    @Deprecated
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0)
            return null;
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static boolean differenceOfSizeBetweenConsecutiveLists(ListNode[] listNodes, int maxDiff) {
        int[] individualListSize = new int[listNodes.length];
        for (int i = 0; i < listNodes.length; i++) {
            ListNode head = listNodes[i];
            int size = 0;
            while (head != null) {
                size++;
                head = head.next;
            }
            individualListSize[i] = size;
        }
        return IntStream.range(1, individualListSize.length).allMatch(it -> (individualListSize[it - 1] -
                individualListSize[it]) <= maxDiff);
    }
}
