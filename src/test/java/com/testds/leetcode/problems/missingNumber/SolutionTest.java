package com.testds.leetcode.problems.missingNumber;

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
    public int[] nums;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, 0, 1}, 2},
                {new int[]{0, 1}, 2},
                {new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMissingNumber() {
        int actualResult = solution.missingNumber(nums);
        assert expectedResult == actualResult;
    }

}
