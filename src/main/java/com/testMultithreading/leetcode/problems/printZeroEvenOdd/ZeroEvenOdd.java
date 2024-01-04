//https://leetcode.com/problems/print-zero-even-odd
package com.testMultithreading.leetcode.problems.printZeroEvenOdd;

import java.util.function.IntConsumer;

public class ZeroEvenOdd {
    private final int n;
    private volatile boolean printZero = true;

    private volatile boolean printOdd = true;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            synchronized (this) {
                while (!printZero) {
                    this.wait();
                }
                printNumber.accept(0);
                printZero = false;
                this.notifyAll();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n;) {
            synchronized (this) {
                while (printZero || printOdd) {
                    this.wait();
                }
                printNumber.accept(i);
                printZero = true;
                printOdd = true;
                i+=2;
                this.notifyAll();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; ) {
            synchronized (this) {
                while (printZero || !printOdd) {
                    this.wait();
                }
                printNumber.accept(i);
                printZero = true;
                printOdd = false;
                i+=2;
                this.notifyAll();
            }
        }
    }
}

