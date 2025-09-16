//https://leetcode.com/problems/replace-non-coprime-numbers-in-array
package com.testds.leetcode.problems.replaceNonCoprimes;

import java.util.*;

public class Solution {

    Map<Integer, Map<Integer, Integer>> GCDMap = new HashMap<>();

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        int num;
        for (int i = 1; i < nums.length; i++) {
            num = nums[i];
            while (!stack.isEmpty() && num > 1) {
                int GCD = gcd(num, stack.peek());
                if (GCD == 1) {
                    break;
                } else {
                    num = LCM(GCD, num, stack.pop());
                }
            }
            stack.push(num);
        }
        return new ArrayList<>(stack);
    }

    private int gcd(int a, int b) {

        if (a > b) {
            if (GCDMap.containsKey(a)
                    && GCDMap.get(a).containsKey(b)) {
                return GCDMap.get(a).get(b);
            }
        } else {
            if (GCDMap.containsKey(b)
                    && GCDMap.get(b).containsKey(a)) {
                return GCDMap.get(b).get(a);
            }
        }

        // Everything divides 0
        if (a == 0) {
            return putAndReturnValue(b, a, b);
        }
        if (b == 0) {
            return putAndReturnValue(a, b, a);
        }

        // Base case
        if (a == b) {
            return putAndReturnValue(a, b, a);
        }

        // a is greater
        int big, small;
        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        return putAndReturnValue(big, small, getGcd(big, small));
    }

    private int getGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int putAndReturnValue(int big, int small, int gcd) {
        if (!GCDMap.containsKey(big)) {
            GCDMap.put(big, new HashMap<>());
        }
        GCDMap.get(big).put(small, gcd);
        return gcd;
    }

    private int LCM(int gcd, int a, int b) {
        return (int) (((long) a * b) / gcd);
    }
}
