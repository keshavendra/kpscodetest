package com.testds.leetcode.problems.generateParenthesis;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int n;

    @Parameterized.Parameter(1)
    public List<String> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {3, Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()")},
                        {1, Collections.singletonList("()")},
                        {4, Arrays.asList("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()")}

                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testGenerateParenthesis() {
        List<String> actualResult = solution.generateParenthesis(n);
        assert actualResult != null;
        Assert.assertEquals(expectedResult, actualResult);
    }

}
