package com.testds.ds.linkedList;

public class LinkedList {

    private ListNode head;

    private int size;

    public LinkedList() {
    }

    //basic operations
    public void addAtLast(int value) {
        if (head == null) {
            head = new ListNode(value);

        } else {
            ListNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = new ListNode(value);
        }
        size++;
    }

    public void addAtBegin(int value) {
        ListNode temp = new ListNode(value);
        temp.next = head;
        head = temp;
        size++;
    }

    public int size() {
        return this.size;
    }

    public void addAtIndex(int value, int index) {
        if (index == 0) {
            addAtBegin(value);
        } else if (index == size) {
            addAtLast(value);
        } else if (index < size && index > 0) {
            ListNode temp = head;
            int count = 0;
            while (count < index - 1) {
                temp = temp.next;
                count++;
            }
            ListNode node = new ListNode(value);
            node.next = temp.next;
            temp.next = node;
            size++;
        } else {
            throw new IndexOutOfBoundsException("index is beyond the current size of the list");
        }

    }

    public boolean contains(int value) {
        if (head == null)
            return false;
        ListNode temp = head;
        while (temp != null) {
            if (temp.value == value)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public int deleteAtIndex(int index) {
        int data = -1;
        if (head != null && index >= 0) {
            if (index == 0) {
                //beginning of list, need to adjust head
                data = head.value;
                head = head.next;
            } else {
                ListNode temp = head;
                int count = 0;
                while (temp != null && count < index - 1) {
                    temp = temp.next;
                    count++;
                }
                if (temp != null && temp.next != null) {
                    //next is the actual node;
                    data = temp.next.value;
                    temp.next = temp.next.next;
                }
            }
        }
        if (data != -1)
            size--;
        return data;
    }

    public static LinkedList createList(int[] nodeValues) {
        LinkedList list = new LinkedList();
        if (nodeValues != null && nodeValues.length > 0) {
            list.head = new ListNode(nodeValues[0]);
            ListNode temp = list.head;
            for (int i = 1; i < nodeValues.length; i++) {
                temp.next = new ListNode(nodeValues[i]);
                temp = temp.next;
            }
            list.size = nodeValues.length;
        }
        return list;
    }

    public int valueAtIndex(int index) {
        int data = -1;
        if (head != null) {
            ListNode temp = head;
            int count = 0;
            while (temp != null && count < index) {
                temp = temp.next;
                count++;
            }
            if (temp != null)
                data = temp.value;
        }
        return data;
    }

}
