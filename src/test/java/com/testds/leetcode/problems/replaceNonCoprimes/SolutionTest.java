package com.testds.leetcode.problems.replaceNonCoprimes;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public int[] nums;

    @Parameterized.Parameter(1)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new int[]{6, 4, 3, 2, 7, 6, 2},
                                new int[]{12, 7, 6}
                        },
                        {
                                new int[]{2, 2, 1, 1, 3, 3, 3},
                                new int[]{2, 1, 1, 3}
                        },
                        {
                                new int[]{517, 11, 121, 517, 3, 51, 3, 1887, 5},
                                new int[]{5687, 1887, 5}
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testReplaceNonCoprimes() {
        List<Integer> actualResult = solution.replaceNonCoprimes(nums);
        assert checkContentsAreEqual(expectedResult, actualResult);
    }

    private boolean checkContentsAreEqual(int[] expectedResult, List<Integer> actualResult) {
        int index = 0;
        for (Integer integer : actualResult) {
            if (!integer.equals(expectedResult[index++])) {
                return false;
            }
        }
        return true;
    }

}
