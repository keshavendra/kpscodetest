//https://leetcode.com/problems/compare-version-numbers/
package com.testds.leetcode.problems.compareVersionNumbers;

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] versionsArray1 = version1.split("\\.");
        String[] versionsArray2 = version2.split("\\.");

        for (int index = 0; index < Math.max(versionsArray1.length, versionsArray2.length); index++) {
            int i1 = 0, i2 = 0;
            if (index < versionsArray1.length)
                i1 = Integer.parseInt(versionsArray1[index]);
            if (index < versionsArray2.length)
                i2 = Integer.parseInt(versionsArray2[index]);
            if (i1 != i2)
                return i1 < i2 ? -1 : 1;
        }
        return 0;
    }
}
