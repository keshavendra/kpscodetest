package com.testds.leetcode.problems.isEvenOddTree;

import com.testds.leetcode.utils.TreeNode;
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
    public Integer[] nodes;

    @Parameterized.Parameter(1)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{1, 10, 4, 3, null, 7, 9, 12, 8, null, null, 6, null, null, 2}, true},
                        {new Integer[]{5, 4, 2, 3, 3, 7}, false},
                        {new Integer[]{5, 9, 1, 3, 5, 7}, false}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testIsEvenOddTree() {
        boolean actualResult = solution.isEvenOddTree(TreeNode.createTree(nodes));
        assertEquals(expectedResult, actualResult);
    }

}
