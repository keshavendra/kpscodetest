package com.testds.leetcode.problems.separateBlkWhtBalls;

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
    public void setup(){
        solution = new Solution();
    }

    @Parameterized.Parameter
    public String s;

    @Parameterized.Parameter(1)
    public long expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"101", 1},
                {"100", 2},
                {"0111", 0}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testSeparateBlkWhtBalls() {
        long actualResult = solution.minimumSteps(s);
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void cleanup(){
        solution = null;
    }

}
