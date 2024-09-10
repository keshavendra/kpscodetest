package com.testds.leetcode.problems.insertGreatestCommonDivisors;

import com.testds.leetcode.utils.ListNode;
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
    public int[] nodes;

    @Parameterized.Parameter(1)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{18, 6, 10, 3}, new int[]{18, 6, 6, 2, 10, 1, 3}},
                        {new int[]{7}, new int[]{7}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testInsertGreatestCommonDivisors() {
        ListNode actualResult = solution.insertGreatestCommonDivisors(ListNode.createList(nodes));
        Assert.assertArrayEquals(expectedResult, ListNode.createArrayFromList(actualResult));
    }

}
