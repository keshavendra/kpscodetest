//https://leetcode.com/problems/copy-list-with-random-pointer/
package com.testds.leetcode.problems.copyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public Node copyRandomList(Node head) {
        Node copyListHead;
        Map<Node, Node> originalListNodeToCopyListNodeMap = new HashMap<>();
        Node originalListNode = head;
        while (originalListNode != null) {
            copyListHead = new Node(originalListNode.val);
            originalListNodeToCopyListNodeMap.put(originalListNode, copyListHead);
            originalListNode = originalListNode.next;
        }

        originalListNode = head;
        while (originalListNode != null) {
            copyListHead = originalListNodeToCopyListNodeMap.get(originalListNode);
            copyListHead.next = originalListNodeToCopyListNodeMap.get(originalListNode.next);
            copyListHead.random = originalListNodeToCopyListNodeMap.get(originalListNode.random);
            originalListNode = originalListNode.next;
        }

        return originalListNodeToCopyListNodeMap.get(head);
    }

    public static Node createList(Integer[][] nodeArray) {
        if (nodeArray == null || nodeArray.length == 0 || nodeArray[0].length == 0)
            return null;
        Node listNode = new Node(nodeArray[0][0]);
        Node[] arrayOfNodes = new Node[nodeArray.length];
        arrayOfNodes[0] = listNode;
        Node prev = listNode;
        for (int i = 1; i < nodeArray.length; i++) {
            Node node = new Node(nodeArray[i][0]);
            prev.next = node;
            prev = node;
            arrayOfNodes[i] = node;
        }

        for (int i = 0; i < nodeArray.length; i++) {
            arrayOfNodes[i].random = nodeArray[i][1] == null ? null : arrayOfNodes[nodeArray[i][1]];
        }

        return listNode;
    }

    public static Integer[][] nodeToListofListOfIntegers(Node head) {
        if (head == null)
            return new Integer[][]{{}};
        Map<Node, Integer> nodeToIndex = new HashMap<>();
        Node temp = head;
        int index = 0;
        while (temp != null) {
            nodeToIndex.put(temp, index);
            index++;
            temp = temp.next;
        }
        Integer[][] nodesArray = new Integer[nodeToIndex.size()][2];
        temp = head;
        index = 0;
        while (temp != null) {
            nodesArray[index][0] = temp.val;
            nodesArray[index][1] = nodeToIndex.get(temp.random);
            temp = temp.next;
            index++;
        }
        return nodesArray;
    }

}