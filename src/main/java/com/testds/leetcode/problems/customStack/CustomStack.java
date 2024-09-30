//https://leetcode.com/problems/design-a-stack-with-increment-operation/
package com.testds.leetcode.problems.customStack;

public class CustomStack {

    private final int size;
    private final int[] stack;
    private int top = -1;

    public CustomStack(int maxSize) {
        this.size = maxSize;
        this.stack = new int[maxSize];
    }

    public void push(int x) {
        if (top < size - 1)
            stack[++top] = x;
    }

    public int pop() {
        if (top != -1)
            return stack[top--];
        return -1;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, top + 1); i++) {
            stack[i] += val;
        }
    }
}
