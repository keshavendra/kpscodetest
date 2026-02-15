package com.testds.leetcode.problems.rangeSumQueryMutable;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class NumArrayTest extends TestCase {

    @Parameterized.Parameter
    public String[] inputOperations;

    @Parameterized.Parameter(1)
    public Object[] inputValues;

    @Parameterized.Parameter(2)
    public List<Integer> expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        new String[]{"NumArray", "sumRange", "update", "sumRange"},
                        new Object[]{Collections.singletonList(new int[]{1, 3, 5}), new int[]{0, 2}, new int[]{1, 2}, new int[]{0, 2}},
                        Arrays.asList(null, 9, null, 8)
                },
                {
                        new String[]{"NumArray", "update", "sumRange", "sumRange", "update", "sumRange"},
                        new Object[]{Collections.singletonList(new int[]{9, -8}), new int[]{0, 3}, new int[]{1, 1}, new int[]{0, 1}, new int[]{1, -3}, new int[]{0, 1}},
                        Arrays.asList(null, null, -8, -5, null, 0)
                }
        });
    }

    public static Test suite() {
        return new TestSuite(NumArrayTest.class);
    }

    @org.junit.Test
    public void testRangeSum() {
        List<Integer> result = new ArrayList<>();
        NumArray numArrayObject = null;
        for (int i = 0; i < inputOperations.length; i++) {
            switch (inputOperations[i]) {
                case "NumArray":
                    numArrayObject = new NumArray(((List<int[]>) inputValues[i]).get(0));
                    result.add(null);
                    break;
                case "sumRange":
                    assert numArrayObject != null;
                    result.add(numArrayObject.sumRange(((int[]) inputValues[i])[0], ((int[]) inputValues[i])[1]));
                    break;
                case "update":
                    assert numArrayObject != null;
                    numArrayObject.update(((int[]) inputValues[i])[0], ((int[]) inputValues[i])[1]);
                    result.add(null);
            }
        }
        Assert.assertEquals(expected, result);
    }

}
