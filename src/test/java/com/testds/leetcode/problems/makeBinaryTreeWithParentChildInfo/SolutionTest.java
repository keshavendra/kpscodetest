package com.testds.leetcode.problems.makeBinaryTreeWithParentChildInfo;

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

    private final static Solution solution = new Solution();

    @Parameterized.Parameter
    public int[][] descriptions;

    @Parameterized.Parameter(1)
    public Integer[] nodes;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}}, new Integer[]{50, 20, 80, 15, 17, 19}},
                        {new int[][]{{1, 2, 1}, {2, 3, 0}, {3, 4, 1}}, new Integer[]{1, 2, null, null, 3, null, null, null, null, 4}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMakeBinaryTreeWithParentChildInfo() {
        TreeNode actualResult = solution.createBinaryTree(descriptions);
        TreeNode expectedResult = TreeNode.createTree(nodes);
        assert TreeNode.treesAreEqual(expectedResult, actualResult);
    }

}
