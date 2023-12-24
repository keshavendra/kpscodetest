package com.testMultithreading.leetcode.problems.printFooBarAlternate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FooBarTest extends TestCase {

    @Parameterized.Parameter
    public int n;

    @Parameterized.Parameter(1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {1, "foobar"},
                        {2, "foobarfoobar"},
                        {3, "foobarfoobarfoobar"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(FooBarTest.class);
    }

    @org.junit.Test
    public void testPrintFooBarAlternate() throws InterruptedException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PrintStream newS = new PrintStream(bos);
        PrintStream saveOut = System.out;
        System.setOut(newS);

        final FooBar fooBar = new FooBar(n);
        Thread threadFoo = new Thread(
                () -> {
                    try {
                        fooBar.foo(
                                () -> System.out.print("foo")
                        );
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        Thread threadBar = new Thread(
                () -> {
                    try {
                        fooBar.bar(
                                () -> System.out.print("bar")
                        );
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        threadFoo.start();
        threadBar.start();
        threadFoo.join();
        threadBar.join();
        System.out.flush();
        System.setOut(saveOut);
        System.out.println();

        assertEquals(expectedResult, bos.toString());
    }

}
