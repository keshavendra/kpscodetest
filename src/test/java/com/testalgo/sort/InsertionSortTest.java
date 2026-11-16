package com.testalgo.sort;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class InsertionSortTest extends TestCase {

    private InsertionSort insertionSort;

    @Parameterized.Parameter
    public int[] inputArray;

    @Parameterized.Parameter(1)
    public int[] expectedArray;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, 2, 1}, new int[]{1, 2, 3}}
        });
    }

    public static Test suite() {
        return new TestSuite(InsertionSortTest.class);
    }

    @Before
    public void setUp() {
        insertionSort = new InsertionSort();
    }

    @org.junit.Test
    public void testSort() {
        int[] actualResult = insertionSort.insertionSort(inputArray);
        Assert.assertArrayEquals(expectedArray, actualResult);
    }

    @After
    public void tearDown() {
        insertionSort = null;
    }
}
