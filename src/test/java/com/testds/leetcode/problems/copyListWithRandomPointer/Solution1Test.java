package com.testds.leetcode.problems.copyListWithRandomPointer;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Solution1Test extends TestCase {
    private final Solution1 solution1 = new Solution1();

    @Parameterized.Parameter
    public Integer[][] originalList;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[][]{{7, null}, {13, 0}, {11, 4}, {10, 2}, {1, 0}}},
                {new Integer[][]{{1, 1}, {2, 1}}},
                {new Integer[][]{{3, null}, {3, 0}, {3, null}}},
                {new Integer[][]{{}}}
        });
    }

    public static junit.framework.Test suite() {
        return new TestSuite(Solution1Test.class);
    }

    @Test
    public void testCopyArrayWithRandomPointer() {
        Node originalListNode = Solution1.createList(originalList);
        Node copiedListNode = solution1.copyRandomList(originalListNode);
        Assert.assertArrayEquals(originalList, Solution1.nodeToListofListOfIntegers(copiedListNode));
    }
}
