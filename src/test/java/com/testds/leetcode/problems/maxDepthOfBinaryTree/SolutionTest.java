package com.testds.leetcode.problems.maxDepthOfBinaryTree;

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
    public int expectedDepth;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{3, 9, 20, null, null, 15, 7}, 3},
                {new Integer[]{1, null, 2}, 2}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMaxDepth() {
        TreeNode root = TreeNode.createTree(nodes);
        int actualDepth = solution.maxDepth(root);
        assert expectedDepth == actualDepth;
    }

}
