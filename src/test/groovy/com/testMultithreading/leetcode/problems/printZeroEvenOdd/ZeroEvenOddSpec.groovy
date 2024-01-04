package com.testMultithreading.leetcode.problems.printZeroEvenOdd


import spock.lang.Specification

import java.util.function.IntConsumer

class ZeroEvenOddSpec extends Specification {
    def "Test PrintZeroEvenOdd"() {
        def bos = new ByteArrayOutputStream()
        def newOut = new PrintStream(bos)
        def saveOut = System.out
        System.out = newOut
        when:
        final zeroEvenOdd = new ZeroEvenOdd(n)
        def threadZero = new Thread(
                new Runnable() {
                    @Override
                    void run() {
                        zeroEvenOdd.zero(new IntConsumer() {
                            @Override
                            void accept(int value) {
                                System.out.print(value)
                            }
                        })
                    }
                }, "ZERO"
        )
        def threadOdd = new Thread(
                new Runnable() {
                    @Override
                    void run() {
                        zeroEvenOdd.odd(new IntConsumer() {
                            @Override
                            void accept(int value) {
                                System.out.print(value)
                            }
                        })
                    }
                }, "ODD"
        )
        def threadEven = new Thread(
                new Runnable() {
                    @Override
                    void run() {
                        zeroEvenOdd.even(new IntConsumer() {
                            @Override
                            void accept(int value) {
                                System.out.print(value)
                            }
                        })
                    }
                }, "EVEN"
        )
        threadZero.start()
        threadOdd.start()
        threadEven.start()
        threadZero.join()
        threadOdd.join()
        threadEven.join()
        System.out.flush()
        System.out = saveOut
        println ""
        then:
        bos.toString() == expectedResult
        where:
        n | expectedResult
        2 | "0102"
        5 | "0102030405"
    }
}
