package com.testds.leetcode.problems.largestValuesInEachTreeRow;

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
        return Arrays.asList(new Object[][]{
                {new Integer[]{1, 3, 2, 5, 3, null, 9}, new Integer[]{1, 3, 9}},
                {new Integer[]{1, 2, 3}, new Integer[]{1, 3}}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testLargestValuesInEachTreeRow() {
        TreeNode root = TreeNode.createTree(nodes);
        List<Integer> actualResult = solution.largestValues(root);
        Assert.assertArrayEquals(expectedResult, actualResult.toArray());
    }
}
