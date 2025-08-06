//https://leetcode.com/problems/fruits-into-baskets-iii/
package com.testds.leetcode.problems.fruitsIntoBaskets3;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Solution {

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int basketsLength = baskets.length;
        int segmentsLength = (int) Math.sqrt(basketsLength);
        int numOfSegments = (basketsLength + segmentsLength - 1) / segmentsLength;
        AtomicInteger count = new AtomicInteger();
        int[] maxVArray = new int[numOfSegments];

        IntStream.range(0, basketsLength)
                .forEach(index -> maxVArray[index / segmentsLength] = Math.max(maxVArray[index / segmentsLength], baskets[index]));

        Arrays.stream(fruits)
                .forEach(fruit -> {
                    AtomicInteger unPlaced = new AtomicInteger(1);
                    IntStream.range(0, numOfSegments)
                            .filter(sec -> maxVArray[sec] >= fruit)
                            .findFirst()
                            .ifPresent(sec -> {
                                AtomicBoolean choose = new AtomicBoolean(false);
                                maxVArray[sec] = 0;
                                IntStream.range(0, segmentsLength)
                                        .map(index -> sec * segmentsLength + index)
                                        .forEach(pos -> {
                                            if (pos < basketsLength && baskets[pos] >= fruit && !choose.get()) {
                                                baskets[pos] = 0;
                                                choose.set(true);
                                            }
                                            if (pos < basketsLength) {
                                                maxVArray[sec] = Math.max(maxVArray[sec], baskets[pos]);
                                            }
                                        });
                                unPlaced.set(0);
                            });

                    count.addAndGet(unPlaced.get());
                });
        return count.get();
    }
}