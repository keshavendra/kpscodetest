package com.testds.leetcode.problems.peopleAwareOfSecret;

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
    public int n;

    @Parameterized.Parameter(1)
    public int delay;

    @Parameterized.Parameter(2)
    public int forget;

    @Parameterized.Parameter(3)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {6, 2, 4, 5},
                        {4, 1, 3, 6},
                        {684, 18, 496, 653668527},
                        {4, 1, 4, 8}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testPeopleAwareOfSecret() {
        assertEquals(expectedResult, solution.peopleAwareOfSecret(n, delay, forget));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}
