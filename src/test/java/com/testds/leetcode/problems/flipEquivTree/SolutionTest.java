package com.testds.leetcode.problems.flipEquivTree;

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

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameter
    public Integer[] nodes1;

    @Parameterized.Parameter(1)
    public Integer[] nodes2;

    @Parameterized.Parameter(2)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{1, 2, 3, 4, 5, 6, null, null, null, 7, 8}, new Integer[]{1, 3, 2, null, 6, 4, 5, null, null, null, null, null, null, 8, 7}, true},
                {new Integer[]{}, new Integer[]{}, true},
                {new Integer[]{}, new Integer[]{1}, false},
                {new Integer[]{0, null, 1}, new Integer[]{0, 1}, true},
                {new Integer[]{0, null, 1}, new Integer[]{0, null, 1}, true}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFlipEquiv() {
        boolean actualResult = solution
                .flipEquiv(TreeNode.createTree(nodes1),
                        TreeNode.createTree(nodes2));
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void cleanup() {
        solution = null;
    }

}
