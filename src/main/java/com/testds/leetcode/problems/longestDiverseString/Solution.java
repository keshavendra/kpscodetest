//https://leetcode.com/problems/longest-happy-string/
package com.testds.leetcode.problems.longestDiverseString;

import java.util.PriorityQueue;

public class Solution {

    private static final class Diverse {
        char ch;
        private int length;

        public Diverse(char ch, int length) {
            this.ch = ch;
            this.length = length;
        }
    }

    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Diverse> pq = new PriorityQueue<>((o1, o2) -> o2.length - o1.length);
        if (a > 0) {
            pq.add(new Diverse('a', a));
        }
        if (b > 0) {
            pq.add(new Diverse('b', b));
        }
        if (c > 0) {
            pq.add(new Diverse('c', c));
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Diverse d = pq.poll();
            if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == d.ch && sb.charAt(sb.length() - 2) == d.ch) {
                if (pq.isEmpty())
                    break;
                Diverse second = pq.poll();
                sb.append(second.ch);
                second.length--;
                if (second.length > 0)
                    pq.add(second);
            } else {
                sb.append(d.ch);
                d.length--;
            }
            if (d.length > 0) {
                pq.add(d);
            }

        }
        return sb.toString();
    }
}
