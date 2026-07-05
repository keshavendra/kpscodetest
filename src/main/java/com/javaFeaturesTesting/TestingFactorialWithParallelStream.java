package com.javaFeaturesTesting;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class TestingFactorialWithParallelStream {
    public static void main(String[] args) {
        BigInteger reduce = LongStream.rangeClosed(1, 5)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE,
                        BigInteger::multiply,
                        BigInteger::multiply);
        System.out.println(reduce);
    }
}
