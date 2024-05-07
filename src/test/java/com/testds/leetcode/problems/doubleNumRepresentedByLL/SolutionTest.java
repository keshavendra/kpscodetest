package com.testds.leetcode.problems.doubleNumRepresentedByLL;

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
    public int[] arr;

    @Parameterized.Parameter(1)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{1, 8, 9}, new int[]{3, 7, 8}},
                        {new int[]{9, 9, 9}, new int[]{1, 9, 9, 8}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testDoubleIt() {
        ListNode head = ListNode.createList(arr);
        ListNode newHead = solution.doubleIt(head);
        Assert.assertArrayEquals(expectedResult, ListNode.createArrayFromList(newHead));
    }

}
