//https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/
package com.testds.leetcode.problems.removeSubfolders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public List<String> removeSubfolders(String[] folder) {
        final Comparator<String> comparator = (o1, o2) -> {
            int i = 0;
            int length = Math.min(o1.length(), o2.length());
            while (i < length && o1.charAt(i) == o2.charAt(i)) {
                i++;
            }
            if (i == length) return o1.length() - o2.length();
            return o1.charAt(i) - o2.charAt(i);
        };

        Arrays.sort(folder, comparator);
        String previous = folder[0] + "/";
        List<String> result = new ArrayList<>();
        for (int i = 1; i < folder.length; i++) {
            String current = folder[i] + "/";
            if (!current.startsWith(previous)) {
                result.add(previous.substring(0, previous.length() - 1));
                previous = current;
            }
        }
        result.add(previous.substring(0, previous.length() - 1));
        return result;
    }

}
