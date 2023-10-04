package com.testds.leetcode.problems.designMyHashMap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class MyHashMapTest extends TestCase {

    @Parameterized.Parameter
    public List<String> operationsList;

    @Parameterized.Parameter(1)
    public int[][] valuesArray;

    @Parameterized.Parameter(2)
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {Arrays.asList("MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"),
                                new int[][]{new int[]{},
                                        new int[]{1, 1},
                                        new int[]{2, 2},
                                        new int[]{1},
                                        new int[]{3},
                                        new int[]{2, 1},
                                        new int[]{2},
                                        new int[]{2},
                                        new int[]{2}},
                                Arrays.asList(null, null, null, 1, -1, null, 1, null, -1)}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(MyHashMapTest.class);
    }

    @org.junit.Test
    public void testMyHashMap() {
        List<Integer> actualResult = Solution.runTest(operationsList, valuesArray);
        assertEquals(expectedResult, actualResult);
    }

}
