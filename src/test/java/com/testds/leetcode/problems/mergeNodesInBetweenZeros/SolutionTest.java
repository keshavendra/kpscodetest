package com.testds.leetcode.problems.mergeNodesInBetweenZeros;

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
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{0, 3, 1, 0, 4, 5, 2, 0}, new int[]{4, 11}},
                        {new int[]{0, 1, 0, 3, 0, 2, 2, 0}, new int[]{1, 3, 4}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMergeNodesInBetweenZeros() {
        ListNode headNode = solution.mergeNodes(ListNode.createList(arr));
        Assert.assertArrayEquals(expectedResult, ListNode.createArrayFromList(headNode));
    }

}
