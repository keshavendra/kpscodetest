//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
package com.testds.leetcode.problems.countHungryStudents;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        Stack<Integer> sandwitchesStack = new Stack<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sandwitchesStack.push(sandwiches[i]);
            studentQueue.add(students[students.length-1-i]);
        }
        int unsatisfyLength = 0;
        while (unsatisfyLength < studentQueue.size() && !studentQueue.isEmpty()) {
            int studentPref = studentQueue.poll();
            if (sandwitchesStack.peek() == studentPref) {
                sandwitchesStack.pop();
                unsatisfyLength = 0;

            }else{
                studentQueue.add(studentPref);
                unsatisfyLength++;
            }
        }
        return unsatisfyLength;
    }
}
