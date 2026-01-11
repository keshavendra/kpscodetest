package com.testds.leetcode.problems.binaryTreeLevelOrderTraversal2;

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
    public List<List<Integer>> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new Integer[]{3, 9, 20, null, null, 15, 7},
                                Arrays.asList(
                                        Arrays.asList(15, 7),
                                        Arrays.asList(9, 20),
                                        Collections.singletonList(3)
                                )
                        },
                        {
                                new Integer[]{1},
                                Collections.singletonList(
                                        Collections.singletonList(1)
                                )
                        },
                        {
                                new Integer[]{},
                                Collections.emptyList()
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setup() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testLevelOrderBottom() {
        List<List<Integer>> actualResult = solution.levelOrderBottom(TreeNode.createTree(nodes));
        Assert.assertEquals(expectedResult, actualResult);
    }

    @After
    public void cleanup() {
        solution = null;
    }

}
