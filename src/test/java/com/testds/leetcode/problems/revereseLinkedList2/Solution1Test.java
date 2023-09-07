package com.testds.leetcode.problems.revereseLinkedList2;

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
public class Solution1Test extends TestCase {
    private final Solution1 solution1 = new Solution1();
    @Parameterized.Parameter
    public int[] inputArray;
    @Parameterized.Parameter(1)
    public int left;
    @Parameterized.Parameter(2)
    public int right;
    @Parameterized.Parameter(3)
    public int[] expectedList;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, 2, 4, new int[]{1, 4, 3, 2, 5}},
                {new int[]{5}, 1, 1, new int[]{5}}
        });
    }

    public static Test suite() {
        return new TestSuite(Solution1Test.class);
    }

    @org.junit.Test
    public void testReverseListBetweenLeftAndRight() {
        ListNode head = ListNode.createList(inputArray);
        head = solution1.reverseBetween(head, left, right);
        Assert.assertArrayEquals(expectedList, ListNode.createArrayFromList(head));
    }
}
