package com.testds.leetcode.problems.replaceWords;

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
    public List<String> dictionary;

    @Parameterized.Parameter(1)
    public String sentence;

    @Parameterized.Parameter(2)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {Arrays.asList("cat", "bat", "rat"), "the cattle was rattled by the battery", "the cat was rat by the bat"},
                        {Arrays.asList("a", "b", "c"), "aadsfasf absbs bbab cadsfafs", "a a b c"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testReplaceWords() {
        String actualResult = solution.replaceWords(dictionary, sentence);
        assertEquals(expectedResult, actualResult);
    }
}
