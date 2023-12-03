package com.testds.leetcode.problems.findThePeaks;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[] mountain;

    @Parameterized.Parameter(1)
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 4, 4}, new ArrayList<>()},
                {new int[]{1, 4, 3, 8, 5}, Arrays.asList(1, 3)}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindThePeaks() {
        List<Integer> actualResult = solution.findPeaks(mountain);
        assert actualResult != null;
        assert expectedResult.size() == actualResult.size();
        if (!expectedResult.isEmpty()) {
            assert actualResult.containsAll(expectedResult);
            assert expectedResult.containsAll(actualResult);
        }
    }

}
