package com.testds.leetcode.problems.wordsWithSubsets;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public String[] words1;

    @Parameterized.Parameter(1)
    public String[] words2;

    @Parameterized.Parameter(2)
    public List<String> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
                                new String[]{"e", "o"},
                                Arrays.asList("facebook", "google", "leetcode")
                        },
                        {
                                new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
                                new String[]{"l", "e"},
                                Arrays.asList("apple", "google", "leetcode")
                        }
                }
        );
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testWordsWithSubsets() {
        List<String> actualResult = solution.wordSubsets(words1, words2);
        assert expectedResult.containsAll(actualResult);
        assert actualResult.containsAll(expectedResult);
    }

    @After
    public void tearDown() {
        solution = null;
    }

}
