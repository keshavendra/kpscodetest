//https://leetcode.com/problems/simple-bank-system/
package com.testds.leetcode.problems.simpleBankSystem;

public class Bank {

    private final long[] balance;

    public Bank(long[] balance) {
        this.balance = balance;
    }

    public boolean transfer(int source, int target, long money) {
        if (source < 1 || source > balance.length || target < 1 || target > balance.length) return false;
        if (balance[source - 1] < money) {
            return false;
        }
        balance[target - 1] += money;
        balance[source - 1] -= money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (account < 1 || account > balance.length) return false;
        balance[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account < 1 || account > balance.length) return false;
        if (balance[account - 1] < money) {
            return false;
        }
        balance[account - 1] -= money;
        return true;
    }
}
