package com.testMultithreading.leetcode.problems.printZeroEvenOdd;

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
public class ZeroEvenOddTest extends TestCase {

    @Parameterized.Parameter
    public int n;

    @Parameterized.Parameter(1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {2, "0102"},
                        {5, "0102030405"}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(ZeroEvenOddTest.class);
    }

    @org.junit.Test
    public void testPrintZeroEvenOdd() throws InterruptedException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PrintStream newS = new PrintStream(bos);
        PrintStream saveOut = System.out;
        System.setOut(newS);

        final ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(n);
        Thread threadZero = new Thread(
                () -> {
                    try {
                        zeroEvenOdd.zero(System.out::print);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }, "ZERO"
        );
        Thread threadOdd = new Thread(
                () -> {
                    try {
                        zeroEvenOdd.odd(System.out::print);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                },"ODD"
        );
        Thread threadEven = new Thread(
                () -> {
                    try {
                        zeroEvenOdd.even(System.out::print);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                },"EVEN"
        );
        threadZero.start();
        threadOdd.start();
        threadEven.start();
        threadZero.join();
        threadOdd.join();
        threadEven.join();
        System.out.flush();
        System.setOut(saveOut);
        System.out.println();

        assertEquals(expectedResult, bos.toString());
    }

}
