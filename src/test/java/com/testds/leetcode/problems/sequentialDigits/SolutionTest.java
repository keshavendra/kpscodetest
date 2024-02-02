package com.testds.leetcode.problems.sequentialDigits;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int low;

    @Parameterized.Parameter(1)
    public int high;

    @Parameterized.Parameter(2)
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {100, 300, Arrays.asList(123, 234)},
                        {1000, 13000, Arrays.asList(1234, 2345, 3456, 4567, 5678, 6789, 12345)}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testSequentialDigits() {
        List<Integer> actualResult = solution.sequentialDigits(low, high);
        Assert.assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }

}
