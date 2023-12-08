package com.testds.leetcode.problems.tree2str;

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
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{1, 2, 3, 4}, "1(2(4))(3)"},
                        {new Integer[]{1, 2, 3, null, 4}, "1(2()(4))(3)"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testTree2Str() {
        TreeNode root = TreeNode.createTree(nodes);
        String actualResult = solution.tree2str(root);
        assertEquals(expectedResult, actualResult);
    }

}
