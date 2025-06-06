package com.testds.leetcode.problems.lexicographicallySmallestEquivalent;

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

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Parameterized.Parameter
    public String s1;

    @Parameterized.Parameter(1)
    public String s2;

    @Parameterized.Parameter(2)
    public String baseString;

    @Parameterized.Parameter(3)
    public String expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"parker", "morris", "parser", "makkek"},
                        {"hello", "world", "hold", "hdld"},
                        {"leetcode", "programs", "sourcecode", "aauaaaaada"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testSmallestEquivalentString() {
        String actual = solution.smallestEquivalentString(s1, s2, baseString);
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}
