package com.testds.leetcode.problems.lengthOfLastWord;

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
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Hello World", 5},
                        {"   fly me   to   the moon  ", 4},
                        {"luffy is still joyboy", 6}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testLengthOfLastWord() {
        int actualResult = solution.lengthOfLastWord(s);
        assertEquals(expectedResult, actualResult);
    }

}
