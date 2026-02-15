//https://leetcode.com/problems/range-sum-query-mutable/
package com.testds.leetcode.problems.rangeSumQueryMutable;

public class NumArray {

    private final int[] rangeSum;
    private final int len;

    public NumArray(int[] nums) {
        this.rangeSum = new int[4 * nums.length];
        buildSegmentTree(nums, 0, nums.length - 1, 0);
        this.len = nums.length;
    }

    private void buildSegmentTree(int[] nums, int l, int r, int index) {
        if (l == r) {
            rangeSum[index] = nums[l];
        } else {
            int mid = l + (r - l) / 2;
            buildSegmentTree(nums, l, mid, 2 * index + 1);
            buildSegmentTree(nums, mid + 1, r, 2 * index + 2);
            rangeSum[index] = rangeSum[2 * index + 1] + rangeSum[2 * index + 2];
        }
    }

    public void update(int index, int val) {
        update(index, val, 0, len - 1, 0);
    }

    private void update(int index, int val, int l, int r, int i) {
        if (l == r) {
            rangeSum[i] = val;
        } else {
            int mid = l + (r - l) / 2;
            if (index <= mid) {
                update(index, val, l, mid, 2 * i + 1);
            } else {
                update(index, val, mid + 1, r, 2 * i + 2);
            }
            rangeSum[i] = rangeSum[2 * i + 1] + rangeSum[2 * i + 2];
        }

    }

    public int sumRange(int left, int right) {
        return query(left, right, 0, len - 1, 0);
    }

    private int query(int left, int right, int l, int r, int index) {
        if (right < l || left > r) {
            return 0;
        }

        if (left <= l && right >= r) {
            return rangeSum[index];
        }

        int mid = l + (r - l) / 2;
        return query(left, right, l, mid, 2 * index + 1)
                + query(left, right, mid + 1, r, 2 * index + 2);
    }
}
