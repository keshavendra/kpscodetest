//https://leetcode.com/problems/sliding-window-maximum/
/*
Constraints:

1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
1 <= k <= nums.length
 */
package com.testds.leetcode.problems.slidingWindowMaximum;


import java.util.ArrayDeque;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();

            while (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            dq.offer(i);

            if (i >= k - 1 && !dq.isEmpty())
                ans[i - k + 1] = nums[dq.peekFirst()];
        }

        return ans;
    }
}
