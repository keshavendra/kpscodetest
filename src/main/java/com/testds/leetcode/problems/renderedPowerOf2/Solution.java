//https://leetcode.com/problems/reordered-power-of-2/
package com.testds.leetcode.problems.renderedPowerOf2;

import java.util.*;

public class Solution {

    private static final Map<Integer, List<Integer>> map = new HashMap<>();

    static {
        map.put(1, Arrays.asList(0, 1, 2, 3));
        map.put(2, Arrays.asList(4, 5, 6));
        map.put(3, Arrays.asList(7, 8, 9));
        map.put(4, Arrays.asList(10, 11, 12, 13));
        map.put(5, Arrays.asList(14, 15, 16));
        map.put(6, Arrays.asList(17, 18, 19));
        map.put(7, Arrays.asList(20, 21, 22, 23));
        map.put(8, Arrays.asList(24, 25, 26));
        map.put(9, Arrays.asList(27, 28, 29));
        map.put(10, Arrays.asList(30, 31, 32));
    }

    public boolean reorderedPowerOf2(int n) {
        Map<Integer, Integer> digitsToFrequency = countNumOfDigits(n);
        List<Integer> numOfDigits = map.get(
                digitsToFrequency
                        .values()
                        .stream()
                        .reduce(0, Integer::sum)
        );

        return numOfDigits
                .stream()
                .mapToInt(x -> (int) Math.pow(2, x))
                .filter(number -> {
                    Map<Integer, Integer> frequency = countNumOfDigits(number);
                    return containsSameValues(digitsToFrequency, frequency);
                })
                .findFirst()
                .isPresent();

    }

    private boolean containsSameValues(Map<Integer, Integer> digitsToFrequency, Map<Integer, Integer> frequency) {
        return digitsToFrequency.keySet().containsAll(frequency.keySet())
                && frequency.keySet().containsAll(digitsToFrequency.keySet())
                &&
                digitsToFrequency
                        .entrySet()
                        .stream()
                        .allMatch(entry -> Objects.equals(frequency.get(entry.getKey()), entry.getValue()));
    }

    private Map<Integer, Integer> countNumOfDigits(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        while (n > 0) {
            map.put(n % 10, map.getOrDefault(n % 10, 0) + 1);
            n = n / 10;
        }
        return map;
    }

}
