//https://www.geeksforgeeks.org/problems/range-minimum-query/1
package com.testds.gfg.rangeMinimumQuery;

/* The functions which
builds the segment tree */
public class GfG {
    static int st[];

    public static int[] constructST(int arr[], int n) {
        // Add your code here
        int[] stree = new int[4 * n];
        buildSegmentTree(stree, arr, 0, n - 1, 0);
        return stree;
    }

    private static void buildSegmentTree(int[] stree, int[] arr, int l, int r, int index) {
        if (l == r) {
            stree[index] = arr[l];
        } else {
            int mid = l + (r - l) / 2;
            buildSegmentTree(stree, arr, l, mid, 2 * index + 1);
            buildSegmentTree(stree, arr, mid + 1, r, 2 * index + 2);
            stree[index] = Math.min(stree[2 * index + 1], stree[2 * index + 2]);
        }
    }

    /* The functions returns the
      min element in the range
      from l and r */
    public static int RMQ(int st1[], int n, int l, int r) {
        // Add your code here
        return RMQ(st1, l, r, 0, n - 1, 0);
    }

    private static int RMQ(int[] st1, int left, int right, int l, int r, int index) {
        if (right < l || left > r) {
            return Integer.MAX_VALUE;
        }
        if (l >= left && r <= right) {
            return st1[index];
        }

        int mid = l + (r - l) / 2;
        return Math.min(
                RMQ(st1, left, right, l, mid, 2 * index + 1),
                RMQ(st1, left, right, mid + 1, r, 2 * index + 2)
        );
    }
}