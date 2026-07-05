package com.javaFeaturesTesting;

import java.util.Random;

public class TestingSimpleLambda {

    private static final int sMAX_COUNT = 20;

    record PrimeResult(int primeCandidate, int smallestFactor) {
    }

    private static PrimeResult checkIfPrime(int primeCandidate) {
        if (primeCandidate % 2 == 0)
            return new PrimeResult(primeCandidate, 2);
        int maxRange = (int) Math.sqrt(primeCandidate);
        int val = 0;
        for (int factor = 3; factor <= maxRange; factor += 2) {
            if (primeCandidate % factor == 0) {
                val = factor;
                break;
            }
        }
        return new PrimeResult(primeCandidate, val);
    }

    private static boolean isOdd(int number) {
        return (number & 1) == 1;
    }

    private static void printResult(PrimeResult primeResult) {
        if (primeResult.smallestFactor == 0) {
            System.out.println(primeResult.primeCandidate
                    + " is a prime ");
        } else {
            System.out.println(primeResult.primeCandidate
                    + " is not a prime with smallest factor "
                    + primeResult.smallestFactor);
        }
    }

    private static void checkForPrimes(int limit) {
        new Random()
                .ints(0, Integer.MAX_VALUE)
                .filter(TestingSimpleLambda::isOdd)
                .mapToObj(TestingSimpleLambda::checkIfPrime)
                .limit(limit)
                .forEach(TestingSimpleLambda::printResult);
    }

    public static void main(String[] args) {
        checkForPrimes(sMAX_COUNT);
    }

}
