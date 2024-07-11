package com.testds.leetcode.problems.reverseParentheses;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private static final Solution solution = new Solution();

    @Parameterized.Parameter
    public String s;

    @Parameterized.Parameter(1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"(abcd)", "dcba"},
                        {"(u(love)i)", "iloveu"},
                        {"(ed(et(oc))el)", "leetcode"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testReverseParentheses() {
        String actualResult = solution.reverseParentheses(s);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
