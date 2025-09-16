//https://leetcode.com/problems/replace-non-coprime-numbers-in-array
package com.testds.leetcode.problems.replaceNonCoprimes;

import java.util.*;

public class Solution {

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerLast(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            while (!deque.isEmpty() && num > 1) {
                int top = deque.peekLast();
                int gcd = getGcd(top, num);

                if (gcd == 1) {
                    break;
                } else {
                    num = getLcm(gcd, num, top);
                    deque.pollLast();
                }
            }

            deque.offerLast(num);
        }

        return new ArrayList<>(deque);
    }

    private int getGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int getLcm(int gcd, int a, int b) {
        return (int) (((long) a * b) / gcd);
    }
}
