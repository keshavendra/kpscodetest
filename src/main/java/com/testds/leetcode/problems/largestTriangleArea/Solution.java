//https://leetcode.com/problems/largest-triangle-area/
package com.testds.leetcode.problems.largestTriangleArea;

public class Solution {

    public double largestTriangleArea(int[][] points) {
        double maxArea = 0, localArea;
        for (int firstPoint = 0; firstPoint < points.length - 2; firstPoint++) {
            for (int secondPoint = firstPoint + 1; secondPoint < points.length - 1; secondPoint++) {
                for (int thirdPoint = secondPoint + 1; thirdPoint < points.length; thirdPoint++) {

                    localArea = calculateArea(points[firstPoint], points[secondPoint], points[thirdPoint]);
                    if (localArea > maxArea) {
                        maxArea = localArea;
                    }
                }
            }
        }
        return maxArea;
    }

    private double calculateArea(int[] pointA,
                                 int[] pointB,
                                 int[] pointC) {
        double sideAB = calculateSide(pointA, pointB);
        double sideBC = calculateSide(pointB, pointC);
        double sideCA = calculateSide(pointC, pointA);
        double semiPerimeter = (sideAB + sideBC + sideCA) / 2;
        return Math.sqrt(semiPerimeter *
                (semiPerimeter - sideAB) *
                (semiPerimeter - sideBC) *
                (semiPerimeter - sideCA));
    }

    private double calculateSide(int[] a, int[] b) {
        return Math.sqrt(Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2));
    }

}
