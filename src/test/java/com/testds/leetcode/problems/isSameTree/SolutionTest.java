package com.testds.leetcode.problems.isSameTree;

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
    public Integer[] p;

    @Parameterized.Parameter(1)
    public Integer[] q;

    @Parameterized.Parameter(2)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{1, 2, 3}, new Integer[]{1, 2, 3}, true},
                        {new Integer[]{1, 2}, new Integer[]{1, null, 2}, false},
                        {new Integer[]{1, 2, 1}, new Integer[]{1, 1, 2}, false}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testIsSameTree() {
        boolean actualResult = solution.isSameTree(TreeNode.createTree(p), TreeNode.createTree(q));
        assertEquals(expectedResult, actualResult);
    }

}
