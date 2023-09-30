package com.testds.leetcode.problems.pattern132;

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
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3, 4}, false},
                        {new int[]{3, 1, 4, 2}, true},
                        {new int[]{-1, 3, 2, 0}, true},
                        {new int[]{3, 5, 0, 3, 4}, true}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testIf132PatternExists() {
        boolean actualResult = solution.find132pattern(nums);
        assert expectedResult == actualResult;
    }

}
