package com.testds.leetcode.problems.reverseWordsInAString3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {
    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public String s;

    @Parameterized.Parameter(1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"},
                        {"God Ding", "doG gniD"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testReverseWordsInString3() {
        String actualResult = solution.reverseWords(s);
        assertEquals(expectedResult, actualResult);
    }
}
