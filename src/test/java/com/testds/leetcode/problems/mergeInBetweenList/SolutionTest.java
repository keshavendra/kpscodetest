package com.testds.leetcode.problems.mergeInBetweenList;

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
    public int[] list1;

    @Parameterized.Parameter(1)
    public int a;

    @Parameterized.Parameter(2)
    public int b;

    @Parameterized.Parameter(3)
    public int[] list2;

    @Parameterized.Parameter(4)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{10, 1, 13, 6, 9, 5}, 3, 4, new int[]{1000000, 1000001, 1000002}, new int[]{10, 1, 13, 1000000, 1000001, 1000002, 5}},
                        {new int[]{0, 1, 2, 3, 4, 5, 6}, 2, 5, new int[]{1000000, 1000001, 1000002, 1000003, 1000004}, new int[]{0, 1, 1000000, 1000001, 1000002, 1000003, 1000004, 6}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMergeInBetweenList() {
        int[] actualResult = ListNode.createArrayFromList(solution.mergeInBetween(ListNode.createList(list1), a, b, ListNode.createList(list2)));
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
