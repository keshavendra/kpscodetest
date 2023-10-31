package com.testds.leetcode.problems.singleNumber3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 1, 3, 2, 5}, new int[]{3, 5}},
                        {new int[]{-1, 0}, new int[]{-1, 0}},
                        {new int[]{0, 1}, new int[]{0, 1}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testSingleNumber() {
        int[] actualResult = solution.singleNumber(nums);
        assert compareArrays(expectedResult, actualResult);
    }

    private boolean compareArrays(int[] expectedResult, int[] actualResult) {
        Map<Integer, Integer> expectedResultMap = new HashMap<>();
        for (int num : expectedResult) {
            expectedResultMap.put(num, expectedResultMap.getOrDefault(num, 0) + 1);
        }
        for (int num : actualResult) {
            if (!expectedResultMap.containsKey(num))
                return false;
            expectedResultMap.put(num, expectedResultMap.get(num) - 1);
            if (expectedResultMap.get(num) <= 0)
                expectedResultMap.remove(num);
        }
        return true;
    }
}
