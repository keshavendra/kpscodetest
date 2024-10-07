//https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/
package com.testds.leetcode.problems.ifPairsCanBeMadeForK;

public class Solution {
    public boolean canArrange(int[] arr, int k) {
        if (k == 1)
            return true;
        int[] freq = new int[k];
        for (int num : arr) {
            freq[((num % k) + k) % k] += 1;
        }
        for (int i = 0; i < k; i++) {
            if ((i == 0) || (i == k - i)) {
                if (freq[i] % 2 == 1) {
                    return false;
                }
                continue;
            }
            if (freq[i] != freq[k - i])
                return false;
        }
        return true;
    }
}
