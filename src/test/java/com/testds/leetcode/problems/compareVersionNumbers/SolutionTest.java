package com.testds.leetcode.problems.compareVersionNumbers;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest {
    private Solution solution;

    @Parameter
    public String version1;
    @Parameter(1)
    public String version2;
    @Parameter(2)
    public int expected;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1.0", "1.0", 0},
                {"1.1", "1.0", 1},
                {"1.0", "1.1", -1},
                {"1.0.1", "1", 1},
                {"1", "1.0.1", -1},
                {"1.01", "1.001", 0},
                {"1.0", "1.0.0", 0},
                {"0.0.0", "0.0.0", 0},
                {"0.1", "1.1", -1},
                {"7.5.2.4", "7.5.3", -1},
                {"1.2", "1.2.0", 0},
                {"1.2.1", "1.2.0", 1}
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
    public void testCompareVersion() {
        Assert.assertEquals(expected, solution.compareVersion(version1, version2));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}
