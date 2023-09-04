//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
package com.testds.leetcode.problems.avgSalExclMinMaxSal;

public class Solution {
    public double average(int[] salary) {
        double totalSal = 0.0;
        int max = salary[0];
        int min = salary[0];
        if (salary[1] > max)
            max = salary[1];
        if (salary[1] < min)
            min = salary[1];
        for (int i = 2; i < salary.length; i++) {
            if (salary[i] < min) {
                totalSal += min;
                min = salary[i];
                continue;
            }
            if (salary[i] > max) {
                totalSal += max;
                max = salary[i];
                continue;
            }
            totalSal += salary[i];
        }
        return totalSal / (salary.length - 2);
    }
}
