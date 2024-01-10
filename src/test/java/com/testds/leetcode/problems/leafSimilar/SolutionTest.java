package com.testds.leetcode.problems.leafSimilar;

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
    public Integer[] nodes1;

    @Parameterized.Parameter(1)
    public Integer[] nodes2;

    @Parameterized.Parameter(2)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{3, 5, 1, 6, 2, 9, 8, null, null, 7, 4}, new Integer[]{3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8}, true},
                        {new Integer[]{1, 2, 3}, new Integer[]{1, 3, 2}, false}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testLeafSimilar() {
        boolean actualResult = solution.leafSimilar(TreeNode.createTree(nodes1), TreeNode.createTree(nodes2));
        assertEquals(expectedResult, actualResult);
    }

}
