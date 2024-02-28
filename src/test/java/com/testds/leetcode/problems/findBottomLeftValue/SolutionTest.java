package com.testds.leetcode.problems.findBottomLeftValue;

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
                        {new Integer[]{2, 1, 3}, 1},
                        {new Integer[]{1, 2, 3, 4, null, 5, 6, null, null, null, null, 7, null}, 7}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindBottomLeftValue() {
        int actualResult = solution.findBottomLeftValue(TreeNode.createTree(nodes));
        assertEquals(expectedResult, actualResult);
    }

}
