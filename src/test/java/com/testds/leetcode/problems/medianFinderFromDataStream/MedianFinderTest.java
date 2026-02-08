package com.testds.leetcode.problems.medianFinderFromDataStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class MedianFinderTest extends TestCase {

    private MedianFinder medianFinder;

    @Parameterized.Parameter
    public String[] operations;

    @Parameterized.Parameter(1)
    public Integer[][] operands;

    @Parameterized.Parameter(2)
    public Double[] expectedResults;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        new String[]{"MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"},
                        new Integer[][]{
                                new Integer[0],
                                new Integer[]{1},
                                new Integer[]{2},
                                new Integer[0],
                                new Integer[]{3},
                                new Integer[0]
                        },
                        new Double[]{null, null, null, 1.5d, null, 2.0d}
                }
        });
    }

    public static Test suite() {
        return new TestSuite(MedianFinderTest.class);
    }

    @Before
    public void setUp() {
        medianFinder = null;
    }

    @org.junit.Test
    public void testMedianFinderOperations() {
        Double[] actual = new Double[operations.length];

        for (int index = 0; index < operations.length; index++) {
            String operation = operations[index];
            Integer[] operand = operands[index];

            switch (operation) {
                case "MedianFinder":
                    medianFinder = new MedianFinder();
                    actual[index] = null;
                    break;
                case "addNum":
                    medianFinder.addNum(operand[0]);
                    actual[index] = null;
                    break;
                case "findMedian":
                    actual[index] = medianFinder.findMedian();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operation: " + operation);
            }
        }

        assertArrayEquals(expectedResults, actual);
    }

    @After
    public void tearDown() {
        medianFinder = null;
    }
}
