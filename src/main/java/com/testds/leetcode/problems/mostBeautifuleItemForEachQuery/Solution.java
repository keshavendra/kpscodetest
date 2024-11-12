//https://leetcode.com/problems/most-beautiful-item-for-each-query/
package com.testds.leetcode.problems.mostBeautifuleItemForEachQuery;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Comparator<int[]> comparator = (item1, item2) -> {
            if (item1[0] == item2[0]) {
                return item2[1] - item1[1];
            } else {
                return item1[0] - item2[0];
            }
        };
        Arrays.sort(items, comparator);
        int prevMax = -1;
        for (int i = 0; i < items.length; i++) {
            if (prevMax > items[i][1]) {
                items[i][1] = prevMax;
            } else {
                prevMax = items[i][1];
            }
        }
        int[] answers = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            answers[i] = query(items, queries[i]);
        }
        return answers;
    }

    private int query(int[][] items, int query) {
        int answer = 0;
        if (!(items[0][0] > query)) {
            if (items[items.length - 1][0] < query) {
                answer = items[items.length - 1][1];
            } else {
                int low = 0, high = items.length - 1, mid;
                while (low <= high) {
                    mid = (low + high) / 2;
                    if (items[mid][0] <= query) {
                        if (answer < items[mid][1])
                            answer = items[mid][1];
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
        }
        return answer;
    }
}
