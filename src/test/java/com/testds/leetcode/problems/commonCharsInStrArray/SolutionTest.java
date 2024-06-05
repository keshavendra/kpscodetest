package com.testds.leetcode.problems.commonCharsInStrArray;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public String[] words;

    @Parameterized.Parameter(1)
    public String[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new String[]{"bella", "label", "roller"}, new String[]{"e", "l", "l"}},
                        {new String[]{"cool", "lock", "cook"}, new String[]{"c", "o"}}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testCommonCharsInStrArray() {
        List<String> actualReesult = solution.commonChars(words);
        assert actualReesult.containsAll(Arrays.asList(expectedResult));
    }

}
