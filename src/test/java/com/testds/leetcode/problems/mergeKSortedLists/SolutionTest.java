package com.testds.leetcode.problems.mergeKSortedLists;

import com.testds.leetcode.utils.ListNode;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
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
    public int[][] listNodes;

    @Parameterized.Parameter(1)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[][]{{1, 4, 5}, {1, 3, 4}, {2, 6}}, new int[]{1, 1, 2, 3, 4, 4, 5, 6}},
                {new int[][]{}, new int[]{}},
                {new int[][]{{}}, new int[]{}}
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
    public void testMergeKSortedLists() {
        ListNode[] inputListsArray = createInputListsArray(listNodes);
        ListNode head = solution.mergeKLists(inputListsArray);
        if (expectedResult == null || expectedResult.length == 0) {
            assert head == null;
        } else {
            Assert.assertArrayEquals(expectedResult, ListNode.createArrayFromList(head));
        }
    }

    private ListNode[] createInputListsArray(int[][] listNodes) {
        ListNode[] inputLists = new ListNode[listNodes.length];
        for (int i = 0; i < listNodes.length; i++) {
            inputLists[i] = (ListNode.createList(listNodes[i]));
        }
        return inputLists;
    }

}
