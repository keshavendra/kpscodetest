package com.testds.leetcode.problems.binaryTreePaths;

import com.testds.leetcode.utils.TreeNode;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public Integer[] nodes;

    @Parameterized.Parameter(1)
    public List<String> expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{1, 2, 3, null, 5}, Arrays.asList("1->2->5", "1->3")},
                {new Integer[]{1}, Collections.singletonList("1")}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testBinaryTreePaths() {
        Assert.assertEquals(expected, solution.binaryTreePaths(TreeNode.createTree(nodes)));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}
