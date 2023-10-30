package com.testds.leetcode.problems.groupAnagrams;

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
    public String[] strs;

    @Parameterized.Parameter(1)
    public List<List<String>> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"eat", "tea", "tan", "ate", "nat", "bat"},
                        Arrays.asList(
                                Collections.singletonList("bat"),
                                Arrays.asList("nat", "tan"),
                                Arrays.asList("ate", "eat", "tea"))
                },
                {new String[]{""},
                        Collections.singletonList(Collections.singletonList(""))
                },
                {new String[]{"a"},
                        Collections.singletonList(Collections.singletonList("a"))
                }
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testGroupAnagrams() {
        List<List<String>> actualResult = solution.groupAnagrams(strs);
        assert matchNestedLists(expectedResult, actualResult);
    }

    public boolean matchNestedLists(List<List<String>> expectedResult, List<List<String>> actualResult) {
        if (expectedResult.containsAll(actualResult))
            return true;
        for (List<String> actualResultList : actualResult) {
            boolean contains = false;
            for (List<String> expectedResultList : expectedResult) {
                if (expectedResultList.containsAll(actualResultList) &&
                        actualResultList.containsAll(expectedResultList) &&
                        expectedResultList.size() == actualResultList.size()) {
                    contains = true;
                    break;
                }
            }
            if (!contains)
                return false;
        }
        return true;
    }
}
