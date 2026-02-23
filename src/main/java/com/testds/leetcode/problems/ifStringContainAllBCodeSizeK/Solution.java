//https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k
package com.testds.leetcode.problems.ifStringContainAllBCodeSizeK;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasAllCodes(String s, int k) {
        if (s.length() <= k)
            return false;
        int num = 0;
        for (int i = 0; i < k; i++) {
            num = (num << 1) + (s.charAt(i) - '0');
        }
        Set<Integer> set = new HashSet<>();
        set.add(num);
        int limit = (1 << k);
        for (int i = k; i < s.length(); i++) {
            num = num << 1;
            num %= limit;
            num = num + (s.charAt(i) - '0');
            set.add(num);
            if (set.size() == limit)
                return true;
        }
        return false;
    }
}
