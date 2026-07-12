package com.testds.leetcode.problems.rankTransformOfAnArray;

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

    @Parameterized.Parameter
    public int[] arr;

    @Parameterized.Parameter(1)
    public int[] result;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{40, 10, 20, 30}, new int[]{4, 1, 2, 3}},
                {new int[]{100, 100, 100}, new int[]{1, 1, 1}},
                {new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12}, new int[]{5, 3, 4, 2, 8, 6, 7, 1, 3}}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testArrayRankTransform() {
        Assert.assertArrayEquals(result, solution.arrayRankTransform(arr));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}
