package com.testds.leetcode.utils;

import com.testds.utils.annotation.Generated;

import java.util.LinkedList;
import java.util.List;

@Generated
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
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

    public static int[] createArrayFromList(ListNode head) {
        List<Integer> resultList = new LinkedList<>();
        while (head != null) {
            resultList.add(head.val);
            head = head.next;
        }
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
