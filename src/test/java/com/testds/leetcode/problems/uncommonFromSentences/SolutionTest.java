package com.testds.leetcode.problems.uncommonFromSentences;

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
    public String s1;

    @Parameterized.Parameter(1)
    public String s2;

    @Parameterized.Parameter(2)
    public String[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"this apple is sweet", "this apple is sour", new String[]{"sweet", "sour"}},
                        {"apple apple", "banana", new String[]{"banana"}},
                        {"s z z z s", "s z ejt", new String[]{"ejt"}},
                        {"apple apple   ", "banana", new String[]{"banana"}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testUncommonFromSentences() {
        String[] actualResult = solution.uncommonFromSentences(s1, s2);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
