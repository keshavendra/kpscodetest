//https://leetcode.com/problems/path-crossing/
package com.testds.leetcode.problems.isPathCrossing;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isPathCrossing(String path) {
        Point p = new Point(0, 0);
        Set<Point> pSet = new HashSet<>();
        pSet.add(p);
        for (char ch : path.toCharArray()) {
            switch (ch) {
                case 'N':
                    p = new Point(p.x, p.y + 1);
                    break;
                case 'E':
                    p = new Point(p.x + 1, p.y);
                    break;
                case 'W':
                    p = new Point(p.x - 1, p.y);
                    break;
                default:
                    p = new Point(p.x, p.y - 1);
            }
            if (!pSet.add(p))
                return true;
        }
        return false;
    }

    private static final class Point {
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int hashCode() {
            return x * 31 + y;
        }

        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj instanceof Point) {
                Point p = (Point) obj;
                return this.x == p.x && this.y == p.y;
            }
            return false;
        }
    }
}