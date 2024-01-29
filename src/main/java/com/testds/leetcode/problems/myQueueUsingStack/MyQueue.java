//https://leetcode.com/problems/implement-queue-using-stacks/
package com.testds.leetcode.problems.myQueueUsingStack;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> mainStack;
    Stack<Integer> auxStack;

    public MyQueue() {
        mainStack = new Stack<>();
        auxStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
    }

    public int pop() {
        while (mainStack.size() > 1) {
            auxStack.push(mainStack.pop());
        }
        int val = mainStack.pop();
        while (!auxStack.isEmpty()) {
            mainStack.push(auxStack.pop());
        }
        return val;
    }

    public int peek() {
        while (!mainStack.isEmpty()) {
            auxStack.push(mainStack.pop());
        }
        int val = auxStack.pop();
        mainStack.push(val);
        while (!auxStack.isEmpty()) {
            mainStack.push(auxStack.pop());
        }
        return val;
    }

    public boolean empty() {
        return mainStack.isEmpty();
    }
}
