package com.testds.leetcode.problems.maxNumberOfBalloons;

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
    public String text;

    @Parameterized.Parameter(1)
    public int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"nlaebolko", 1},
                {"loonbalxballpoon", 2},
                {"leetcode", 0}
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
    public void testMaxNumberOfBalloons() {
        assertEquals(expected, solution.maxNumberOfBalloons(text));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}
