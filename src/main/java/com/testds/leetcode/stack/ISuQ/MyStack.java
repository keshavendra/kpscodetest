//https://leetcode.com/problems/implement-stack-using-queues/submissions/

package com.testds.leetcode.stack.ISuQ;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack<T> {
    private Queue<T> mainQueue;
    private Queue<T> auxilaryQueue;

    public MyStack() {
        this.mainQueue = new LinkedList<>();
        this.auxilaryQueue = new LinkedList<>();
    }

    public void push(T x) {
        this.auxilaryQueue.add(x);
        while (!this.mainQueue.isEmpty()) {
            this.auxilaryQueue.add(this.mainQueue.poll());
        }
        Queue<T> tempQueue = this.mainQueue;
        this.mainQueue = this.auxilaryQueue;
        this.auxilaryQueue = tempQueue;
    }

    public T pop() {
        return this.mainQueue.poll();
    }

    public T top() {
        return this.mainQueue.peek();
    }

    public boolean empty() {
        return this.mainQueue.isEmpty();
    }
}
