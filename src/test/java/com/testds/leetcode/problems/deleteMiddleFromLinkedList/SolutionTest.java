package com.testds.leetcode.problems.deleteMiddleFromLinkedList;

import com.testds.leetcode.utils.ListNode;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public int[] listNodes;

    @Parameterized.Parameter(1)
    public int[] expectedList;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 3, 4, 7, 1, 2, 6}, new int[]{1, 3, 4, 1, 2, 6}},
                {new int[]{1, 2, 3, 4}, new int[]{1, 2, 4}},
                {new int[]{2, 1}, new int[]{2}}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testDeleteMiddle() {
        ListNode head = solution.deleteMiddle(ListNode.createList(listNodes));
        Assert.assertArrayEquals(expectedList, ListNode.createArrayFromList(head));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}
