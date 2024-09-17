package com.testds.leetcode.problems.minTimeDifference;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private static final Solution solution = new Solution();

    @Parameterized.Parameter
    public List<String> timePoints;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Arrays.asList("23:59", "00:00"), 1},
                {Arrays.asList("00:00", "23:59", "00:00"), 0},
                {Arrays.asList("01:01", "02:01", "03:00"), 59},
                {Arrays.asList("00:00", "04:00", "22:00"), 120}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinTimeDifference() {
        int actualResult = solution.findMinDifference(timePoints);
        assertEquals(expectedResult, actualResult);
    }

}
