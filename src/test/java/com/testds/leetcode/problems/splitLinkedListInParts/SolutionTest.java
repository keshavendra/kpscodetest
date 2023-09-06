package com.testds.leetcode.problems.splitLinkedListInParts;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
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
    public int k;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3}, 5},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testSplitLInkedListInParts() {
        ListNode head = ListNode.createList(inputList);
        ListNode[] listNodesArray = solution.splitListToParts(head, k);
        assert listNodesArray.length == k;
        assert ListNode.differenceOfSizeBetweenConsecutiveLists(listNodesArray, 1);
    }

}
