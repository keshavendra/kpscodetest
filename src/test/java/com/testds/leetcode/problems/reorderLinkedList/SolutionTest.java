package com.testds.leetcode.problems.reorderLinkedList;

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
                        {new int[]{1, 2, 3, 4}, new int[]{1, 4, 2, 3}},
                        {new int[]{1, 2, 3, 4, 5}, new int[]{1, 5, 2, 4, 3}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testReorderLinkedList() {
        ListNode head = ListNode.createList(arr);
        solution.reorderList(head);
        Assert.assertArrayEquals(expectedResult, ListNode.createArrayFromList(head));
    }

}
