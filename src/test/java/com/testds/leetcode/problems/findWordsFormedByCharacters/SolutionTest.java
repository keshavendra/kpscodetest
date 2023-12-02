package com.testds.leetcode.problems.findWordsFormedByCharacters;

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
    public String[] words;

    @Parameterized.Parameter(1)
    public String chars;

    @Parameterized.Parameter(2)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new String[]{"cat", "bt", "hat", "tree"}, "atach", 6},
                        {new String[]{"hello", "world", "leetcode"}, "welldonehoneyr", 10}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testCountCharacters() {
        int actualResult = solution.countCharacters(words, chars);
        assert expectedResult == actualResult;
    }

}
