//https://leetcode.com/problems/arithmetic-subarrays/
package com.testds.leetcode.problems.checkArithmeticSubarrays;

import java.util.*;

public class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> resultList = new ArrayList<>(l.length);
        for (int i = 0; i < l.length; i++) {
            int left = l[i];
            int right = r[i];
            if (right - left < 2)
                resultList.add(true);
            else {
                Queue<Integer> queue = new PriorityQueue<>(right - left + 1, Comparator.reverseOrder());
                for (int j = left; j <= right; j++) queue.add(nums[j]);
                boolean isAP = true;
                int diff = queue.poll() - queue.peek();
                while (queue.size() > 1) {
                    if (queue.poll() - queue.peek() != diff) {
                        isAP = false;
                        break;
                    }
                }
                resultList.add(isAP);
            }
        }
        return resultList;
    }

    public Boolean check(int[] arr) {
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;
        Set<Integer> arrSet = new HashSet<>();

        for (int num : arr) {
            minElement = Math.min(minElement, num);
            maxElement = Math.max(maxElement, num);
            arrSet.add(num);
        }

        if ((maxElement - minElement) % (arr.length - 1) != 0) {
            return false;
        }

        int diff = (maxElement - minElement) / (arr.length - 1);
        int curr = minElement + diff;

        while (curr < maxElement) {
            if (!arrSet.contains(curr)) {
                return false;
            }

            curr += diff;
        }

        return true;
    }

    public List<Boolean> checkArithmeticSubarrays1(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int[] arr = new int[r[i] - l[i] + 1];
            System.arraycopy(nums, l[i], arr, 0, arr.length);

            ans.add(check(arr));
        }

        return ans;
    }
}
