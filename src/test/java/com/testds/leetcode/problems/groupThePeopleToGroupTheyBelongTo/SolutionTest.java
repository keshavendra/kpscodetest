package com.testds.leetcode.problems.groupThePeopleToGroupTheyBelongTo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();
    @Parameterized.Parameter
    public int[] groupSizes;
    @Parameterized.Parameter(1)
    public int[][] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, 3, 3, 3, 3, 1, 3}, new int[][]{
                        {5}, {0, 1, 2}, {3, 4, 6}
                }},
                {new int[]{2, 1, 3, 3, 3, 2}, new int[][]{
                        {1}, {0, 5}, {2, 3, 4}
                }}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testGroups() {
        List<List<Integer>> resultList = solution.groupThePeople(groupSizes);
        assert resultList != null;
        IntStream.range(0, expectedResult.length).forEach(x -> Arrays.stream(expectedResult[x]).forEach(y -> {
            assert resultList.get(x).contains(y);
        })
        );
    }

}
