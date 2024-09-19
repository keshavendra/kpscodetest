package com.testds.leetcode.problems.findTheLongestSubstringOfVowels;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
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
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"leetcodeisgreat", 5},
                        {"eleetminicoworoep", 13},
                        {"szy", 3},
                        {"eleetminicoworoep", 13}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @org.junit.Test
    public void testFindTheLongestSubstring() {
        assertEquals(expectedResult, solution.findTheLongestSubstring(s));
    }

}
