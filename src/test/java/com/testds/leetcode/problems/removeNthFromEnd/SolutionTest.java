package com.testds.leetcode.problems.removeNthFromEnd;

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

    private static final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[] arr;

    @Parameterized.Parameter(1)
    public int n;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3, 4, 5}, 2, new int[]{1, 2, 3, 5}},
                        {new int[]{1}, 1, new int[]{}},
                        {new int[]{1, 2}, 1, new int[]{1}},
                        {new int[]{1, 2}, 2, new int[]{2}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testRemoveNthFromEnd() {
        int[] actualResult = ListNode.createArrayFromList(solution.removeNthFromEnd(ListNode.createList(arr), n));
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
