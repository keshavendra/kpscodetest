package com.testds.leetcode.problems.removeDuplicatesFromSortedList;

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
    public int[] inputList;
    @Parameterized.Parameter(1)
    public int[] expectedList;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 2}, new int[]{1, 2}},
                {new int[]{1, 1, 2, 3, 3}, new int[]{1, 2, 3}}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testRemovalOfDuplicates() {
        ListNode head = ListNode.createList(inputList);
        ListNode resultListHead = solution.deleteDuplicates(head);
        Assert.assertArrayEquals(expectedList, ListNode.createArrayFromList(resultListHead));
    }
}
