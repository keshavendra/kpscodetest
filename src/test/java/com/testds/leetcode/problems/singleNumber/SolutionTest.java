package com.testds.leetcode.problems.singleNumber;

import com.testds.leetcode.problems.revereseLinkedList2.Solution1Test;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {
    private final Solution solution = new Solution();
    @Parameterized.Parameter
    public int[] nums;
    @Parameterized.Parameter(1)
    public int expectedNumber;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 2, 1}, 1},
                {new int[]{4, 1, 2, 1, 2}, 4},
                {new int[]{1}, 1}
        });
    }

    public static Test suite() {
        return new TestSuite(Solution1Test.class);
    }

    @org.junit.Test
    public void testToFetchUniqueNumber() {
        int actualResult = solution.singleNumber(nums);
        assert expectedNumber == actualResult;
    }
}
