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
public class SelectionSortTest extends TestCase {

    private SelectionSort selectionSort;

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
        return new TestSuite(SelectionSortTest.class);
    }

    @Before
    public void setUp() {
        selectionSort = new SelectionSort();
    }

    @org.junit.Test
    public void testSelectionSort() {
        int[] actualResult = selectionSort.selectionSort(inputArray);
        Assert.assertArrayEquals(expectedArray, actualResult);
    }

    @After
    public void tearDown() {
        selectionSort = null;
    }

}
