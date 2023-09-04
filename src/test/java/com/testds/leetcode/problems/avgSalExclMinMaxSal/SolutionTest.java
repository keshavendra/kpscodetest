package com.testds.leetcode.problems.avgSalExclMinMaxSal;

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
    public int[] salary;
    @Parameterized.Parameter(1)
    public double expectedAvgSal;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{4000, 3000, 1000, 2000}, 2500.00000},
                {new int[]{1000, 2000, 3000}, 2000.00000}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testAvgSalCase() {
        assert solution.average(salary) == expectedAvgSal;
    }
}
