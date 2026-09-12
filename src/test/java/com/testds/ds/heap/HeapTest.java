package com.testds.ds.heap;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HeapTest extends TestCase {

    @Parameterized.Parameters(name = "capacity={0}, values={1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, new int[]{3, 1, 2}, new int[]{3, 2, 1}},
                {5, new int[]{11, 32, 1, 32, 2}, new int[]{32, 32, 11, 2, 1}}
        });
    }

    private final int capacity;
    private final int[] values;
    private final int[] expectedRemovalOrder;

    public HeapTest(int capacity, int[] values, int[] expectedRemovalOrder) {
        this.capacity = capacity;
        this.values = values;
        this.expectedRemovalOrder = expectedRemovalOrder;
    }

    @Test
    public void addIncreasesSizeAndKeepsTheLargestValueAtTheTop() {
        Heap heap = new Heap(capacity);

        for (int index = 0; index < values.length; index++) {
            assertTrue(heap.add(values[index]));
            assertEquals(index + 1, heap.size());
        }

        assertEquals(expectedRemovalOrder[0], heap.top());
        assertFalse(heap.isEmpty());
        assertFalse(heap.add(0));
        assertEquals(values.length, heap.size());
    }

    @Test
    public void removeReturnsValuesInDescendingOrderAndEmptiesTheHeap() {
        Heap heap = new Heap(capacity);
        for (int value : values) {
            assertTrue(heap.add(value));
        }

        for (int expected : expectedRemovalOrder) {
            assertEquals(expected, heap.remove());
        }

        assertTrue(heap.isEmpty());
        assertEquals(0, heap.size());
        assertEquals(-1, heap.top());
        assertEquals(-1, heap.remove());
    }
}
