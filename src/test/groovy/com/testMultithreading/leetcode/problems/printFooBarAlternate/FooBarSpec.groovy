package com.testMultithreading.leetcode.problems.printFooBarAlternate

import spock.lang.Specification

class FooBarSpec extends Specification {

    def setup() {
    }

    def "Test PrintFooBarAlternate"() {
        def bos = new ByteArrayOutputStream()
        def newOut = new PrintStream(bos)
        def saveOut = System.out
        System.out = newOut
        when:
        final fooBar = new FooBar(n)
        def threadFoo = new Thread(
                new Runnable() {
                    @Override
                    void run() {
                        fooBar.foo(
                                new Runnable() {
                                    @Override
                                    void run() {
                                        print("foo")
                                    }
                                }
                        )
                    }
                }
        )
        def threadBar = new Thread(
                new Runnable() {
                    @Override
                    void run() {
                        fooBar.bar(
                                new Runnable() {
                                    @Override
                                    void run() {
                                        print("bar")
                                    }
                                }
                        )
                    }
                }
        )
        threadFoo.start()
        threadBar.start()
        threadFoo.join()
        threadBar.join()
        System.out.flush()
        System.out = saveOut
        println ""
        then:
        bos.toString() == expectedResult
        where:
        n | expectedResult
        1 | "foobar"
        2 | "foobarfoobar"
        3 | "foobarfoobarfoobar"
    }

}
