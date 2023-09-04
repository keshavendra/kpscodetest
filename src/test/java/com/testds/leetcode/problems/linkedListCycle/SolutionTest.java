package com.testds.leetcode.problems.linkedListCycle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {
    private static final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[] arr;
    @Parameterized.Parameter(1)
    public int position;
    @Parameterized.Parameter(2)
    public boolean expectedHasCycle;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, 2, 0, -4}, 1, true},
                {new int[]{1, 2}, 0, true},
                {new int[]{1}, -1, false}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testHasCycle() {
        boolean actualHasCycle = solution.hasCycle(Solution.createList(arr, position));
        assert actualHasCycle == expectedHasCycle;
    }
}
