//https://leetcode.com/problems/add-two-numbers/
package com.testds.leetcode.problems.addTwoNumber;

import com.testds.leetcode.utils.ListNode;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnListNode = new ListNode();
        int sumAndCarry = 0;
        //assume 1st list is bigger and second is smaller
        ListNode bigList = l1;
        ListNode smallList = l2;
        ListNode newListNode = returnListNode;
        while (bigList != null && smallList != null) {
            sumAndCarry = sumAndCarry + bigList.val + smallList.val;
            ListNode node = new ListNode(sumAndCarry % 10);
            sumAndCarry = sumAndCarry / 10;
            newListNode.next = node;
            newListNode = newListNode.next;

            bigList = bigList.next;
            smallList = smallList.next;
            //reset the bigList if it consumes first and set smallList to null
            if (bigList == null) {
                bigList = smallList;
                smallList = null;
            }
        }
        while (bigList != null) {
            sumAndCarry = bigList.val + sumAndCarry;
            ListNode node = new ListNode(sumAndCarry % 10);
            sumAndCarry = sumAndCarry / 10;
            bigList = bigList.next;
            newListNode.next = node;
            newListNode = newListNode.next;
        }

        //last for carry
        if (sumAndCarry != 0)
            newListNode.next = new ListNode(sumAndCarry);
        return returnListNode.next;
    }

    public static ListNode createList(int[] arr) {
        ListNode list = new ListNode();
        ListNode temp = list;
        for (int j : arr) {
            temp.next = new ListNode(j);
            temp = temp.next;
        }
        return list.next;
    }

    public static void printList(ListNode list) {
        System.out.print("\n");
        while (list != null) {
            System.out.print(list.val + "\t");
            list = list.next;
        }
    }
}