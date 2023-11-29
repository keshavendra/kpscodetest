package com.testds.leetcode.problems.numberOf1Bits;

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
    public String n;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"00000000000000000000000000001011", 3},
                        {"00000000000000000000000010000000", 1},
                        {"11111111111111111111111111111101", 31}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testNumberOf1Bits() {
        int num;
        if (n.charAt(0) == '1') {
            //negative number
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 32; i++) {
                sb.append(n.charAt(i) == '1' ? '0' : '1');
            }
            num = Integer.parseInt(sb.toString(), 2) + 1;
            num *= -1;
        } else {
            num = Integer.parseInt(n, 2);
        }

        int actualResult = solution.hammingWeight(num);
        assert expectedResult == actualResult;
    }

}
