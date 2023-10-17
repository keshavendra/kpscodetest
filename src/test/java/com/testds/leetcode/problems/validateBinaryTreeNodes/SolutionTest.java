package com.testds.leetcode.problems.validateBinaryTreeNodes;

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
    public int n;

    @Parameterized.Parameter(1)
    public int[] leftChild;

    @Parameterized.Parameter(2)
    public int[] rightChild;

    @Parameterized.Parameter(3)
    public boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {4, new int[]{1, -1, 3, -1}, new int[]{2, -1, -1, -1}, true},
                        {4, new int[]{1, -1, 3, -1}, new int[]{2, 3, -1, -1}, false},
                        {2, new int[]{1, 0}, new int[]{-1, -1}, false},
                        {6, new int[]{1, -1, -1, 4, -1, -1}, new int[]{2, -1, -1, 5, -1, -1}, false},
                        {4, new int[]{3, -1, 1, -1}, new int[]{-1, -1, 0, -1}, true}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testValidateBinaryTreeNodes() {
        boolean actualResult = solution.validateBinaryTreeNodes(n, leftChild, rightChild);
        assert expectedResult == actualResult;
    }
}
