package com.testds.leetcode.problems.pascalsTriangle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {
    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int numRows;
    @Parameterized.Parameter(1)
    public int[][] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, new int[][]{{1}}},
                {2, new int[][]{{1}, {1, 1}}},
                {3, new int[][]{{1}, {1, 1}, {1, 2, 1}}},
                {4, new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}}},
                {5, new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}}},
                {6, new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}, {1, 5, 10, 10, 5, 1}}}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testPascalsTriangle() {
        Assert.assertThat(convertArrayToIntegerList(expectedResult), is(solution.generate(numRows)));
    }

    public List<List<Integer>> convertArrayToIntegerList(int[][] array) {
        List<List<Integer>> resultList = new ArrayList<>();
        for (int[] x : array) {
            List<Integer> list1 = new ArrayList<>();
            for (int j : x) {
                list1.add(j);
            }
            resultList.add(list1);
        }
        return resultList;
    }
}
