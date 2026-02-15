package com.testds.leetcode.problems.rangeSumQueryImmutable;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class NumArrayTest extends TestCase {

    @Parameterized.Parameter
    public String[] operations;

    @Parameterized.Parameter(1)
    public Object[] inputValues;

    @Parameterized.Parameter(2)
    public List<Integer> expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        new String[]{"NumArray", "sumRange", "sumRange", "sumRange"},
                        new Object[]{
                                Collections.singletonList(new int[]{-2, 0, 3, -5, 2, -1}),
                                new int[]{0, 2},
                                new int[]{2, 5},
                                new int[]{0, 5}
                        },
                        Arrays.asList(null, 1, -1, -3)
                }
        });
    }

    public static Test suite() {
        return new TestSuite(NumArrayTest.class);
    }

    @org.junit.Test
    public void testRangeSum() {
        NumArray numArrayObject = null;
        List<Integer> actualResult = new ArrayList<>();
        for (int index = 0; index < operations.length; index++) {
            switch (operations[index]) {
                case "NumArray":
                    numArrayObject = new NumArray(((List<int[]>) inputValues[index]).get(0));
                    actualResult.add(null);
                    break;
                case "sumRange":
                    assert numArrayObject != null;
                    actualResult.add(numArrayObject.sumRange(((int[]) inputValues[index])[0], ((int[]) inputValues[index])[1]));
            }
        }
        assertEquals(expected, actualResult);
    }

}
