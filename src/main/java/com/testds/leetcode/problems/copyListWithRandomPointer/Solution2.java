//https://leetcode.com/problems/copy-list-with-random-pointer/
package com.testds.leetcode.problems.copyListWithRandomPointer;

public class Solution2 {
    public Node copyRandomList(Node head) {
        if (head == null)
            return head;
        Node tempNode = head;
        while (tempNode != null) {
            Node copyNode = new Node(tempNode.val);
            copyNode.next = tempNode.next;
            tempNode.next = copyNode;
            tempNode = copyNode.next;
        }
        Node copyListHead = head.next;
        tempNode = head;
        //setting random pointer in the copy list
        while (tempNode != null) {
            tempNode.next.random = tempNode.random == null ? null : tempNode.random.next;
            tempNode = tempNode.next.next;
        }
        //re-setting the next pointers
        tempNode = head;
        while (tempNode != null) {
            Node tempCopyListNode = tempNode.next;
            tempNode.next = tempCopyListNode.next;
            tempCopyListNode.next = tempNode.next != null ? tempNode.next.next : null;
            tempNode = tempNode.next;
        }
        return copyListHead;
    }
}
