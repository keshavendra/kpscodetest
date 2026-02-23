package com.testds.leetcode.problems.ifStringContainAllBCodeSizeK;

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
    public int k;

    @Parameterized.Parameter(2)
    public boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"00110110", 2, true},
                {"11", 1, false},
                {"01", 1, true},
                {"0110", 1, true},
                {"0110", 2, false},
                {"00110", 2, true}
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
    public void testHasAllCodes() {
        boolean actual = solution.hasAllCodes(s, k);
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() {
        solution = null;
    }
}
