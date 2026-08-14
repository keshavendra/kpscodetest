package com.testds.leetcode.problems.validSequenceForWords;

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

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public String word1;

    @Parameterized.Parameter(1)
    public String word2;

    @Parameterized.Parameter(2)
    public int[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"vbcca", "abc", new int[]{0, 1, 2}},
                {"bacdc", "abc", new int[]{1, 2, 4}}
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
    public void testValidSequence() {
        Assert.assertArrayEquals(expectedResult, solution.validSequence(word1, word2));
    }

    @After
    public void tearDown() {
        solution = null;
    }

}
