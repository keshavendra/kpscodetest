//https://leetcode.com/problems/minimum-pair-removal-to-sort-array-ii
package com.testds.leetcode.problems.minimumPairRemoval2;


import java.util.PriorityQueue;

public class Solution {

    public int minimumPairRemoval(int[] nums) {
        PriorityQueue<PairCandidate> pq = new PriorityQueue<>();
        boolean[] merged = new boolean[nums.length];

        int inversionCount = 0, operations = 0;

        ListNode current = new ListNode(nums[0], 0), newNode;

        for (int i = 1; i < nums.length; i++) {
            newNode = new ListNode(nums[i], i);
            newNode.prev = current;
            current.next = newNode;
            if (current.value > newNode.value) {
                inversionCount++;
            }
            pq.offer(new PairCandidate(current, newNode, current.value + newNode.value));
            current = newNode;
        }

        while (inversionCount > 0) {
            PairCandidate candidate = pq.poll();
            assert candidate != null;
            ListNode left = candidate.left;
            ListNode right = candidate.right;

            if (merged[left.originalIndex]
                    || merged[right.originalIndex]
                    || left.value + right.value != candidate.sum) {
                continue;
            }

            operations++;

            if (left.value > right.value) {
                inversionCount--;
            }

            ListNode prevNode = left.prev, nextNode = right.next;
            long mergedValue = candidate.sum;

            //relink the list after merge
            //keep the left node only
            left.next = nextNode;

            if (prevNode != null) {
                if (prevNode.value > left.value && prevNode.value <= mergedValue) {
                    inversionCount--;
                } else if (prevNode.value <= left.value
                        && prevNode.value > mergedValue) {
                    inversionCount++;
                }
                pq.offer(new PairCandidate(prevNode, left, prevNode.value + mergedValue));
            }

            if (nextNode != null) {
                nextNode.prev = left;

                if (nextNode.value < right.value && nextNode.value >= mergedValue) {
                    inversionCount--;
                } else if (nextNode.value >= right.value && nextNode.value < mergedValue) {
                    inversionCount++;
                }

                pq.offer(new PairCandidate(left, nextNode, mergedValue + nextNode.value));
            }

            left.value = mergedValue;
            merged[right.originalIndex] = true;

        }

        return operations;

    }

    static class ListNode {
        long value;
        int originalIndex;
        ListNode prev, next;

        ListNode(long value, int originalIndex) {
            this.value = value;
            this.originalIndex = originalIndex;
        }
    }

    static class PairCandidate implements Comparable<PairCandidate> {
        ListNode left, right;
        long sum;

        public PairCandidate(ListNode left, ListNode right, long sum) {
            this.sum = sum;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(PairCandidate other) {
            if (this.sum != other.sum) {
                return Long.compare(this.sum, other.sum);
            } else {
                return this.left.originalIndex - other.left.originalIndex;
            }
        }
    }
}
