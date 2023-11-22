package com.testds.leetcode.problems.diagonalTraverse2;

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
    public List<List<Integer>> nums;

    @Parameterized.Parameter(1)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        Arrays.asList(Arrays.asList(1, 2, 3),
                                Arrays.asList(4, 5, 6),
                                Arrays.asList(7, 8, 9)),
                        new int[]{1, 4, 2, 7, 5, 3, 8, 6, 9}
                },
                {
                        Arrays.asList(Arrays.asList(1, 2, 3, 4, 5),
                                Arrays.asList(6, 7),
                                Collections.singletonList(8),
                                Arrays.asList(9, 10, 11),
                                Arrays.asList(12, 13, 14, 15, 16)),
                        new int[]{1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16}
                }
        });
    }

    public static Test suite(){
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindDiagonalOrder(){
        int[] actualResult = solution.findDiagonalOrder(nums);
        Assert.assertArrayEquals(expectedResult,actualResult);
    }

}
