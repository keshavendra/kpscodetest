package com.testds.leetcode.problems.deleteLeavesWithAGivenValue;

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
    public int target;

    @Parameterized.Parameter(2)
    public Integer[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{1, 2, 3, 2, null, 2, 4}, 2, new Integer[]{1, null, 3, null, null, null, 4}},
                        {new Integer[]{1, 3, 3, 3, 2}, 3, new Integer[]{1, 3, null, null, 2}},
                        {new Integer[]{1, 2, null, 2, null, null, null, 2}, 2, new Integer[]{1}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testDeleteLeavesWithAGivenValue() {
        TreeNode root = TreeNode.createTree(nodes);
        TreeNode actualResult = solution.removeLeafNodes(root, target);
        assertTrue(TreeNode.treesAreEqual(actualResult, TreeNode.createTree(expectedResult)));
    }

}
