package com.testds.leetcode.problems.closestNodesQueriesInABst;

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
    public List<Integer> queries;

    @Parameterized.Parameter(2)
    public List<List<Integer>> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        new Integer[]{6, 2, 13, 1, 4, 9, 15, null, null, null, null, null, null, 14},
                        Arrays.asList(2, 5, 16),
                        Arrays.asList(Arrays.asList(2, 2), Arrays.asList(4, 6), Arrays.asList(15, -1))
                },
                {
                        new Integer[]{4, null, 9},
                        Collections.singletonList(3),
                        Collections.singletonList(Arrays.asList(-1, 4))
                }
        });
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void test() {
        List<List<Integer>> actualResult = solution.closestNodes(TreeNode.createTree(nodes), queries);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}
