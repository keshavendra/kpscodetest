//https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
package com.testds.leetcode.problems.groupThePeopleToGroupTheyBelongTo;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        TreeMap<Integer, ArrayList<ArrayList<Integer>>> mapListSizeToListOfLists = new TreeMap<>();
        for (int person = 0; person < groupSizes.length; person++) {
            int groupSize = groupSizes[person];
            ArrayList<ArrayList<Integer>> listOfGroups = mapListSizeToListOfLists.get(groupSize);
            if (listOfGroups == null || listOfGroups.isEmpty()) {
                listOfGroups = new ArrayList<>();
                listOfGroups.add(new ArrayList<>());
                mapListSizeToListOfLists.put(groupSize, listOfGroups);
            }
            ArrayList<Integer> lastGroup = listOfGroups.get(listOfGroups.size() - 1);
            if (lastGroup.size() == groupSize) {
                //we need to form a new group
                lastGroup = new ArrayList<>();
                listOfGroups.add(lastGroup);
            }
            lastGroup.add(person);
        }
        return mapListSizeToListOfLists
                .entrySet()
                .stream()
                .flatMap(x -> x.getValue().stream())
                .collect(Collectors.toList());
    }
}
