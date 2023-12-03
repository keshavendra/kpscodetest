//https://leetcode.com/problems/find-the-peaks/
package com.testds.leetcode.problems.findThePeaks;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> listOfPeaks = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1])
                listOfPeaks.add(i);
        }
        return listOfPeaks;
    }
}
