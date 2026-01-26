package com.testds.leetcode.problems.flattenBinaryTree;

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
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{1, 2, 5, 3, 4, null, 6}, 6},
                        {new Integer[]{}, 0},
                        {new Integer[]{0}, 1}
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
    public void testFlatten() {
        TreeNode root = TreeNode.createTree(nodes);
        solution.flatten(root);

        int count = 0;
        TreeNode current = root;
        while (current != null) {
            assertNull("Left child should be null after flattening", current.left);
            count++;
            current = current.right;
        }
        assertEquals(expectedResult, count);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}