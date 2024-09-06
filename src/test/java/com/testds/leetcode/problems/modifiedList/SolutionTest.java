package com.testds.leetcode.problems.modifiedList;

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
    public int[] nums;

    @Parameterized.Parameter(1)
    public int[] nodes;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 2, 3}, new int[]{1, 2, 3, 4, 5}, new int[]{4, 5}},
                        {new int[]{1}, new int[]{1, 2, 1, 2, 1, 2}, new int[]{2, 2, 2}},
                        {new int[]{5}, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}},
                        {new int[]{1, 7, 6, 2, 4}, new int[]{3, 7, 1, 8, 1}, new int[]{3, 8}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testModifiedList() {
        ListNode actualResult = solution.modifiedList(nums, ListNode.createList(nodes));
        Assert.assertArrayEquals(expectedResult, ListNode.createArrayFromList(actualResult));
    }

}
