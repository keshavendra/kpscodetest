package com.testds.leetcode.problems.maxAncestorDiff;

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
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{1, null, 2, null, null, null, 0, null, null, null, null, null, null, 3, null}, 3},
                        {new Integer[]{8, 3, 10, 1, 6, null, 14, null, null, 4, 7, null, null, 13, null}, 7}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMaxAncestorDiff() {
        int actualResult = solution.maxAncestorDiff(TreeNode.createTree(nodes));
        assertEquals(expectedResult, actualResult);
    }

}
