package com.testds.leetcode.problems.defuseTheBomb;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Before
    public void setup() {
        this.solution = new Solution();
    }

    @Parameterized.Parameter
    public int[] code;

    @Parameterized.Parameter(1)
    public int k;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{5, 7, 1, 4}, 3, new int[]{12, 10, 16, 13}},
                        {new int[]{1, 2, 3, 4}, 0, new int[]{0, 0, 0, 0}},
                        {new int[]{2, 4, 9, 3}, -2, new int[]{12, 5, 6, 13}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void test() {
        int[] actualResult = solution.decrypt(code, k);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        this.solution = null;
    }
}
