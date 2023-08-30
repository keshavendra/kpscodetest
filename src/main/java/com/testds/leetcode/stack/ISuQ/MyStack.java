//https://leetcode.com/problems/implement-stack-using-queues/submissions/

package com.testds.leetcode.stack.ISuQ;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> mainQueue;
    private Queue<Integer> auxilaryQueue;

    public MyStack() {
        this.mainQueue = new LinkedList<>();
        this.auxilaryQueue = new LinkedList<>();
    }

    public void push(int x) {
        this.auxilaryQueue.add(x);
        while (!this.mainQueue.isEmpty()) {
            this.auxilaryQueue.add(this.mainQueue.poll());
        }
        Queue<Integer> tempQueue = this.mainQueue;
        this.mainQueue = this.auxilaryQueue;
        this.auxilaryQueue = tempQueue;
    }

    public int pop() {
        return this.mainQueue.poll();
    }

    public int top() {
        return this.mainQueue.peek();
    }

    public boolean empty() {
        return this.mainQueue.isEmpty();
    }
}
