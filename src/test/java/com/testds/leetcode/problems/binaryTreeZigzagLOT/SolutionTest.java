package com.testds.leetcode.problems.binaryTreeZigzagLOT;

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
import java.util.Collections;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public Integer[] nodes;

    @Parameterized.Parameter(1)
    public List<List<Integer>> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{3, 9, 20, null, null, 15, 7}, Arrays.asList(Collections.singletonList(3), Arrays.asList(20, 9), Arrays.asList(15, 7))},
                        {new Integer[]{1}, Collections.singletonList(Collections.singletonList(1))},
                        {new Integer[]{}, Collections.emptyList()}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testZigzagLevelOrder() {
        List<List<Integer>> actualResult = solution.zigzagLevelOrder(TreeNode.createTree(nodes));
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}
