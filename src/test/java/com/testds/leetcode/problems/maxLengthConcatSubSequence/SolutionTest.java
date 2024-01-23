package com.testds.leetcode.problems.maxLengthConcatSubSequence;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
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
    public List<String> arr;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {Arrays.asList("un", "iq", "ue"), 4},
                        {Arrays.asList("cha", "r", "act", "ers"), 6},
                        {Collections.singletonList("abcdefghijklmnopqrstuvwxyz"), 26}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMaxLengthConcatSubSequence() {
        int actualResult = solution.maxLength(arr);
        assertEquals(expectedResult, actualResult);
    }
}
