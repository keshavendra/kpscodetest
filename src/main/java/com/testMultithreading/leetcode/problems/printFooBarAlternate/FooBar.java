//https://leetcode.com/problems/print-foobar-alternately/
package com.testMultithreading.leetcode.problems.printFooBarAlternate;

public class FooBar {
    private final int n;
    private volatile boolean isFooPrinted = false;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (this) {
                while (isFooPrinted) {
                    try {
                        this.wait();
                    } catch (Exception ignored) {
                    }
                }

                // printFoo.run() outputs "foo". Do not change or remove this line.

                printFoo.run();
                isFooPrinted = true;
                this.notifyAll();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            synchronized (this) {
                while (!isFooPrinted) {
                    try {
                        this.wait();
                    } catch (Exception ignored) {
                    }
                }
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                isFooPrinted = false;
                this.notifyAll();
            }
        }
    }
}
