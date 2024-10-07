package com.testds.leetcode.problems.differentWaysToAddParantheses;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public String expression;

    @Parameterized.Parameter(1)
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"2-1-1", Arrays.asList(0, 2)},
                        {"2*3-4*5", Arrays.asList(-34, -14, -10, -10, 10)},
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testDifferentWaysToAddParantheses() {
        List<Integer> actualResult = solution.diffWaysToCompute(expression);
        Collections.sort(actualResult);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
