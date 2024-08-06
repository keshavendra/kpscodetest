package com.testds.leetcode.problems.minNumOfPushesToTypeWord;

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
    public String word;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"abcde", 5},
                        {"xyzxyzxyzxyz", 12},
                        {"aabbccddeeffgghhiiiiii", 24}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinimumPushes() {
        int actualResult = solution.minimumPushes(word);
        assertEquals(expectedResult, actualResult);
    }

}
