package com.testds.leetcode.problems.reverseOddLevels;

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
    public Integer[] expectedTrees;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{2, 3, 5, 8, 13, 21, 34}, new Integer[]{2, 5, 3, 8, 13, 21, 34}},
                        {new Integer[]{7, 13, 11}, new Integer[]{7, 11, 13}},
                        {
                                new Integer[]{0, 1, 2, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2},
                                new Integer[]{0, 2, 1, 0, 0, 0, 0, 2, 2, 2, 2, 1, 1, 1, 1}
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testReverseOddLevels() {
        TreeNode actualResult = solution.reverseOddLevels(TreeNode.createTree(nodes));
        assert TreeNode.treesAreEqual(actualResult, TreeNode.createTree(expectedTrees));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}
