package com.testds.leetcode.problems.verticalTraversal;

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
    public List<List<Integer>> expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new Integer[]{1, 2, 3, 4, 6, 5, 7},
                                Arrays.asList(Collections.singletonList(4), Collections.singletonList(2), Arrays.asList(1, 5, 6), Collections.singletonList(3), Collections.singletonList(7))
                        },
                        {
                                new Integer[]{3, 1, 4, 0, 2, 2},
                                Arrays.asList(Collections.singletonList(0), Collections.singletonList(1), Arrays.asList(3, 2, 2), Collections.singletonList(4))
                        }
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
    public void testVerticalTraversal() {
        List<List<Integer>> actualResult = solution.verticalTraversal(TreeNode.createTree(nodes));
        assertEquals(expected, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}
