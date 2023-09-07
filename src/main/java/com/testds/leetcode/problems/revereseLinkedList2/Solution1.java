//https://leetcode.com/problems/reverse-linked-list-ii/
package com.testds.leetcode.problems.revereseLinkedList2;

import com.testds.leetcode.utils.ListNode;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution1 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        Map<Integer, ListNode> sequenceToNodeMap = new TreeMap<>();
        int count = 1;
        while (temp != null) {
            sequenceToNodeMap.put(count, temp);
            count++;
            temp = temp.next;
        }
        Map<Integer, ListNode> sequenceToNodeMapAfterReverse = new TreeMap<>();
        //map nodes from start till left-1
        for (count = 1; count < left; count++) {
            sequenceToNodeMapAfterReverse.put(count, sequenceToNodeMap.remove(count));
        }
        //count points to left
        //push nodes from left to right
        for (int i = right; i >= left; i--, count++) {
            sequenceToNodeMapAfterReverse.put(count, sequenceToNodeMap.remove(i));
        }

        sequenceToNodeMapAfterReverse.putAll(sequenceToNodeMap);

        head = temp = null;
        Iterator<Map.Entry<Integer, ListNode>> iterator = sequenceToNodeMapAfterReverse.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, ListNode> entry = iterator.next();
            if (head == null) {
                head = temp = entry.getValue();
            } else {
                temp.next = entry.getValue();
                temp = temp.next;
            }
            if (!iterator.hasNext()) {
                temp.next = null;
            }
        }
        return head;
    }
}
