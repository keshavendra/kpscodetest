package com.testds.leetcode.problems.deleteNodeInABST;

import com.testds.leetcode.utils.TreeNode;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public Integer[] nodes;

    @Parameterized.Parameter(1)
    public int key;

    @Parameterized.Parameter(2)
    public Integer[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{5, 3, 6, 2, 4, null, 7}, 3, new Integer[]{5, 2, 6, null, 4, null, 7}},
                        {new Integer[]{5, 3, 6, 2, 4, null, 7}, 0, new Integer[]{5, 3, 6, 2, 4, null, 7}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setup() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testDeleteNode() {
        TreeNode actualResult = solution.deleteNode(TreeNode.createTree(nodes), key);
        assert TreeNode.treesAreEqual(TreeNode.createTree(expectedResult), actualResult);
    }

    @After
    public void cleanup() {
        solution = null;
    }
}