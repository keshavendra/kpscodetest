//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
package com.testds.leetcode.problems.finalPriceWithSpcDiscount;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(new Solution().finalPrices(prices)));
        prices = new int[]{8, 4, 6, 2, 3};
        System.out.println(Arrays.toString(new Solution().finalPrices(prices)));
        prices = new int[]{10, 1, 1, 6};
        System.out.println(Arrays.toString(new Solution().finalPrices(prices)));
    }

    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i = prices.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(prices[i]);
            } else {
                while (!stack.isEmpty() && prices[i] < stack.peek()) {
                    stack.pop();
                }
                int prev = prices[i];
                if (!stack.isEmpty()) {
                    prices[i] -= stack.peek();
                }
                stack.push(prev);
            }
        }
        return prices;
    }
}
