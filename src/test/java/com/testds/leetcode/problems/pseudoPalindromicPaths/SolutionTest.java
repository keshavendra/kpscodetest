package com.testds.leetcode.problems.pseudoPalindromicPaths;

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
                        {new Integer[]{2, 3, 1, 3, 1, null, 1}, 2},
                        {new Integer[]{2, 1, 1, 1, 3, null, null, null, null, null, 1}, 1}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testPseudoPalindromicPaths() {
        int actualResult = solution.pseudoPalindromicPaths(TreeNode.createTree(nodes));
        assertEquals(expectedResult, actualResult);
    }
}
