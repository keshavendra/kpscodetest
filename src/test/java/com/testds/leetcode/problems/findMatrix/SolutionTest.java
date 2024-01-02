package com.testds.leetcode.problems.findMatrix;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public int[][] oneOfTheResults;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 3, 4, 1, 2, 3, 1}, new int[][]{{1, 3, 4, 2}, {1, 3}, {1}}},
                        {new int[]{1, 2, 3, 4}, new int[][]{{4, 3, 2, 1}}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindMatrix() {
        List<List<Integer>> actualResult = solution.findMatrix(nums);
        assert actualResult != null;
        Map<Integer, Set<Integer>> mapOfSet = new HashMap<>();
        for (int i = 0; i < actualResult.size(); i++) {
            List<Integer> integerList = actualResult.get(i);
            mapOfSet.put(i, new HashSet<>());
            for (Integer integer : integerList) {
                if (!mapOfSet.get(i).add(integer)) throw new AssertionError();
            }
        }
    }

}
