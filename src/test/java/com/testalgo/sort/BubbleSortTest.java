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
public class BubbleSortTest extends TestCase {

    private BubbleSort bubbleSort;

    @Parameterized.Parameter
    public int[] array;

    @Parameterized.Parameter(1)
    public int[] expectedArray;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, 2, 1}, new int[]{1, 2, 3}}
        });
    }

    public static Test suite() {
        return new TestSuite(BubbleSortTest.class);
    }

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @org.junit.Test
    public void testBubbleSort() {
        var resultArray = bubbleSort.bubbleSort(array);
        assertEquals(expectedArray.length, resultArray.length);
        Assert.assertArrayEquals(expectedArray, resultArray);
    }

    @After
    public void tearDown() {
        bubbleSort = null;
    }

}
