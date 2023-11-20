package com.testds.leetcode.problems.garbageCollection;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public String[] garbage;

    @Parameterized.Parameter(1)
    public int[] travel;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new String[]{"G", "P", "GP", "GG"}, new int[]{2, 4, 3}, 21},
                        {new String[]{"MMM", "PGM", "GP"}, new int[]{3, 10}, 37}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testGarbageCollection() {
        int actualResult = solution.garbageCollection(garbage, travel);
        assert expectedResult == actualResult;
    }

}
