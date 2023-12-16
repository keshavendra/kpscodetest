//https://leetcode.com/problems/destination-city/
package com.testds.leetcode.problems.destinationCity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> allCities = new HashSet<>();
        Set<String> sourceCities = new HashSet<>();
        for (List<String> srcDestCity : paths) {
            sourceCities.add(srcDestCity.get(0));
            allCities.addAll(srcDestCity);
        }
        allCities.removeAll(sourceCities);
        return allCities.iterator().next();
    }
}
