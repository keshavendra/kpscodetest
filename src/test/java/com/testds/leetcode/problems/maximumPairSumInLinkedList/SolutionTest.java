package com.testds.leetcode.problems.maximumPairSumInLinkedList;

import com.testds.leetcode.utils.ListNode;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public int[] nodes;

    @Parameterized.Parameter(1)
    public int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{5, 4, 2, 1}, 6},
                {new int[]{4, 2, 2, 3}, 7},
                {new int[]{1, 100000}, 100001}
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
    public void testPairSum() {
        int actualResult = solution.pairSum(ListNode.createList(nodes));
        assertEquals(expected, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}
