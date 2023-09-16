package com.testds.leetcode.problems.swapNodesInPairs;

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
    public int[] inputArray;
    @Parameterized.Parameter(1)
    public int[] expectedList;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4}, new int[]{2, 1, 4, 3}},
                {new int[]{}, new int[]{}},
                {new int[]{1}, new int[]{1}}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testSwapNodes() {
        ListNode head = ListNode.createList(inputArray);
        head = solution.swapPairs(head);
        Assert.assertArrayEquals(expectedList, ListNode.createArrayFromList(head));
    }

}
