package com.testds.leetcode.problems.findWinners;

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
    public int[][] matches;

    @Parameterized.Parameter(1)
    public List<List<Integer>> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new int[][]{
                                        {1, 3},
                                        {2, 3},
                                        {3, 6},
                                        {5, 6},
                                        {5, 7},
                                        {4, 5},
                                        {4, 8},
                                        {4, 9},
                                        {10, 4},
                                        {10, 9}
                                },
                                Arrays.asList(
                                        Arrays.asList(1, 2, 10),
                                        Arrays.asList(4, 5, 7, 8)
                                )
                        },
                        {
                                new int[][]{
                                        {2, 3},
                                        {1, 3},
                                        {5, 4},
                                        {6, 4}
                                },
                                Arrays.asList(
                                        Arrays.asList(1, 2, 5, 6),
                                        Collections.emptyList()
                                )
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindWinners() {
        List<List<Integer>> actualResult = solution.findWinners(matches);
        Assert.assertEquals(expectedResult.size(), actualResult.size());
        for (int i = 0; i < expectedResult.size(); i++) {
            List<Integer> expectedList = expectedResult.get(0);
            List<Integer> actualList = actualResult.get(0);
            assert expectedList.size() == actualList.size();
            assert expectedList.containsAll(actualList);
            assert actualList.containsAll(expectedList);
        }
    }

}
