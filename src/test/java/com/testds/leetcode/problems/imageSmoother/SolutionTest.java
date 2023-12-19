package com.testds.leetcode.problems.imageSmoother;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[][] img;

    @Parameterized.Parameter(1)
    public int[][] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{
                                {1, 1, 1},
                                {1, 0, 1},
                                {1, 1, 1}},
                                new int[][]{
                                        {0, 0, 0},
                                        {0, 0, 0},
                                        {0, 0, 0}
                                }},
                        {new int[][]{
                                {100, 200, 100},
                                {200, 50, 200},
                                {100, 200, 100}
                        }, new int[][]{
                                {137, 141, 137},
                                {141, 138, 141},
                                {137, 141, 137}
                        }}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testImageSmoother() {
        int[][] actualResult = solution.imageSmoother(img);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
