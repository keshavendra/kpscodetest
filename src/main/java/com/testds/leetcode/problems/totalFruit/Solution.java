//https://leetcode.com/problems/fruit-into-baskets/
package com.testds.leetcode.problems.totalFruit;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int totalFruit(int[] fruits) {
        int len = 0, num, i = 0, startIndex = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (i < fruits.length) {
            num = fruits[i];
            if (map.isEmpty()) {
                startIndex = i;
                map.put(num, i);
                i++;
                continue;
            }

            if (num == fruits[i - 1]) {
                i++;
                continue;
            }

            if (map.containsKey(num)) {
                map.put(num, i);
                i++;
                continue;
            }

            if (map.size() < 2) {
                map.put(num, i);
                i++;
                continue;
            }

            if ((i - startIndex) > len) {
                len = i - startIndex;
            }

            startIndex = map.get(fruits[i - 1]);
            map.clear();
            map.put(fruits[i - 1], startIndex);
            map.put(fruits[i], i);
            i++;
        }

        if ((fruits.length - startIndex) > len) {
            len = fruits.length - startIndex;
        }

        return len;
    }
}
