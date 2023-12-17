package com.testds.leetcode.problems.inorderTraversal;

import com.testds.leetcode.utils.TreeNode;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public Integer[] nodes;

    @Parameterized.Parameter(1)
    public Integer[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new Integer[]{1, null, 2, null, null, 3},
                                new Integer[]{1, 3, 2}
                        },
                        {
                                new Integer[]{},
                                new Integer[]{}
                        },
                        {
                                new Integer[]{1},
                                new Integer[]{1}
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testInorderTraversal() {
        List<Integer> actualResult = solution.inorderTraversal(TreeNode.createTree(nodes));
        Assert.assertArrayEquals(expectedResult, actualResult.toArray());
    }

}
