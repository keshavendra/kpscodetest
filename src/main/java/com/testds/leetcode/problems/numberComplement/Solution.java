//https://leetcode.com/problems/number-complement/
package com.testds.leetcode.problems.numberComplement;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().findComplement(5));
    }

    public int findComplement(int num) {
        int msb = 31;
        for (; msb >= 0; msb--) {
            if ((num & (1<<msb)) != 0)
                break;
        }
        for(;msb>=0; msb--) {
            num = num ^ (1<<msb);
        }
        return num;
    }
}
