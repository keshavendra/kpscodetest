package com.testds.leetcode.problems.countingBits;

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
    public int n;

    @Parameterized.Parameter(1)
    public int[] expectedList;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, new int[]{0, 1, 1}},
                {5, new int[]{0, 1, 1, 2, 1, 2}}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void test() {
        assert Arrays.equals(expectedList, solution.countBits(n));
    }
}
