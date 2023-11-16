package com.testds.leetcode.problems.findDifferentBinaryString;

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
    public String[] nums;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new String[]{"01", "10"}},
                {new String[]{"00", "01"}}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testFindDifferentBinaryString() {
        String actualResult = solution.findDifferentBinaryString(nums);
        assert actualResult!=null;
        assert !Arrays.asList(nums).contains(actualResult);
        assert actualResult.length() == nums.length;
    }

}
