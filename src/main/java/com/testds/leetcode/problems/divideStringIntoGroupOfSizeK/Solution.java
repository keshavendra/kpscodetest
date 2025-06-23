//https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/
package com.testds.leetcode.problems.divideStringIntoGroupOfSizeK;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] divideString(String s, int k, char fill) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        while (index < s.length()) {
            sb.append(s.charAt(index++));
            if (sb.length() == k) {
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        if(sb.length() !=0) {
            while (sb.length() < k) {
                sb.append(fill);
            }
            list.add(sb.toString());
        }
        return list.toArray(new String[0]);
    }
}
