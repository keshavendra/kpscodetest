//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
package com.testds.leetcode.problems.removeDuplicatesFromSortedList2;

import com.testds.leetcode.utils.ListNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        TreeMap<Integer, List<ListNode>> treeMap = new TreeMap<>();
        ListNode temp = head;
        while (temp != null) {
            List<ListNode> listNodes = treeMap.computeIfAbsent(temp.val, k -> new LinkedList<>());
            listNodes.add(temp);
            temp = temp.next;
        }
        head = null;
        for (Map.Entry<Integer, List<ListNode>> next : treeMap.entrySet()) {
            if (next.getValue().size() == 1) {
                if (head == null) {
                    head = next.getValue().get(0);
                    temp = head;
                } else {
                    temp.next = next.getValue().get(0);
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
        return head;
    }
}
