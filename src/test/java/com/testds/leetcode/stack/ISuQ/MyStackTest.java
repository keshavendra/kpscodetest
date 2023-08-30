package com.testds.leetcode.stack.ISuQ;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MyStackTest extends TestCase {

    private MyStack stack;
    int[] listOfElements;

    public MyStackTest(String testName) {
        super(testName);
    }

    public void setUp() throws Exception {
        super.setUp();
        stack = new MyStack();
    }

    public static Test suite() {
        return new TestSuite(MyStackTest.class);
    }

    public void testPush() {
        listOfElements = new int[]{1, 2, 3};
        Arrays.stream(listOfElements).forEach(x -> stack.push(x));
        assertFalse(stack.empty());
        assertEquals(listOfElements[listOfElements.length - 1], stack.top());
    }

    public void testPop() {
        listOfElements = new int[]{1, 2, 3};
        Arrays.stream(listOfElements).forEach(x -> stack.push(x));
        assertFalse(stack.empty());
        IntStream.of(2, 1, 0).forEach(y ->
            assertEquals(listOfElements[y], stack.pop()));
        assertTrue(stack.empty());
    }

    public void testPeek() {
        listOfElements = new int[]{1, 2, 3};
        Arrays.stream(listOfElements).forEach(x -> stack.push(x));
        assertFalse(stack.empty());
        assertEquals(listOfElements[listOfElements.length - 1], stack.top());
        assertFalse(stack.empty());
    }

    public void testEmpty() {
        assertTrue(stack.empty());
        listOfElements = new int[]{1, 2, 3};
        Arrays.stream(listOfElements).forEach(x -> stack.push(x));
        assertFalse(stack.empty());
    }
}
