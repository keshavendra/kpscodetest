package com.testds.leetcode.problems.addSpaceToString;

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
    public String s;

    @Parameterized.Parameter(1)
    public int[] spaces;

    @Parameterized.Parameter(2)
    public String expectedString;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"LeetcodeHelpsMeLearn", new int[]{8, 13, 15}, "Leetcode Helps Me Learn"},
                        {"icodeinpython", new int[]{1, 5, 7, 9}, "i code in py thon"},
                        {"spacing", new int[]{0, 1, 2, 3, 4, 5, 6}, " s p a c i n g"}
                }
        );
    }

    @Before
    public void setup() {
        solution = new Solution();
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testAddSpaces() {
        String actualResult = solution.addSpaces(s, spaces);
        assertEquals(expectedString, actualResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}
