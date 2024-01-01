//https://leetcode.com/problems/assign-cookies/
package com.testds.leetcode.problems.findContentChildren;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int greedIndex = 0, satisfactionIndex = 0;
        while (greedIndex < g.length && satisfactionIndex < s.length) {
            if (g[greedIndex] <= s[satisfactionIndex]) {
                greedIndex++;
            }
            satisfactionIndex++;
        }
        return greedIndex;
    }
}
