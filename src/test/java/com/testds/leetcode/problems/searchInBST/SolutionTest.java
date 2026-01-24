package com.testds.leetcode.problems.searchInBST;

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
    public int value;

    @Parameterized.Parameter(2)
    public Integer[] expectedNodes;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{4, 2, 7, 1, 3}, 2, new Integer[]{2, 1, 3}},
                {new Integer[]{4, 2, 7, 1, 3}, 5, new Integer[]{}}
        });
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testSearchBST() {
        TreeNode actualResult = solution.searchBST(TreeNode.createTree(nodes), value);
        if (expectedNodes.length == 0) {
            assert actualResult == null;
        } else {
            assert TreeNode.treesAreEqual(TreeNode.createTree(expectedNodes), actualResult);
        }
    }

    @After
    public void tearDown() {
        solution = null;
    }

}
