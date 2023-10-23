package com.testds.ds.linkedList;

import com.testds.utils.annotation.Generated;

@Generated
public class ListNode {
    int value;

    ListNode next;

    @Deprecated
    public ListNode() {

    }

    public ListNode(int value) {
        this.value = value;
    }

    @Deprecated
    public ListNode(int value, ListNode next) {
        this(value);
        this.next = next;
    }

}
