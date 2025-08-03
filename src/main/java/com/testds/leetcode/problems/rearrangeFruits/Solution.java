//https://leetcode.com/problems/rearranging-fruits/
package com.testds.leetcode.problems.rearrangeFruits;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        //creating a frequency map firstBasketFruitsAndFrequencyMap from first basket
        TreeMap<Integer, Long> firstBasketFruitsAndFrequencyMap = new TreeMap<>(Arrays.stream(basket1)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        //finding the minimum value fruit
        int minValueFruit = firstBasketFruitsAndFrequencyMap.firstKey();

        //creating a frequency map secondBasketFruitsAndFrequencyMap from second basket.
        // Here cancelling out the balanced fruits from firstBasketFruitsAndFrequencyMap.
        TreeMap<Integer, Long> secondBasketFruitsAndFrequencyMap = new TreeMap<>(Arrays.stream(basket2)
                .filter(b -> {
                    if (firstBasketFruitsAndFrequencyMap.containsKey(b)) {
                        firstBasketFruitsAndFrequencyMap.put(b, firstBasketFruitsAndFrequencyMap.getOrDefault(b, 0L) - 1);
                        if (firstBasketFruitsAndFrequencyMap.get(b) == 0) {
                            firstBasketFruitsAndFrequencyMap.remove(b);
                        }
                        return false;
                    }
                    return true;
                })
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        //making variables to be used within the loop to save keys and values from firstBasketFruitsAndFrequencyMap and
        int firstBasketFrequencyMapKey, secondBasketFrequencyMapKey;
        long firstBasketFrequencyMapValue, secondBasketFrequencyMapValue, minimumCost = 0L;

        //checking if any unique lower values is there in the secondBasketFruitsAndFrequencyMap
        if (!secondBasketFruitsAndFrequencyMap.isEmpty()) {
            minValueFruit = Math.min(minValueFruit, secondBasketFruitsAndFrequencyMap.firstKey());
        }

        //looping over all the keys and value of firstBasketFruitsAndFrequencyMap
        for (Map.Entry<Integer, Long> entry : firstBasketFruitsAndFrequencyMap.entrySet()) {
            firstBasketFrequencyMapKey = entry.getKey();
            firstBasketFrequencyMapValue = entry.getValue();

            //odd frequency cannot be adjusted.
            if (firstBasketFrequencyMapValue % 2 != 0) {
                return -1L;
            }

            while (firstBasketFrequencyMapValue > 0) {

                //lower key from firstBasketFruitsAndFrequencyMap should be adjusted for higheest key in the secondBasketFruitsAndFrequencyMap
                secondBasketFrequencyMapKey = secondBasketFruitsAndFrequencyMap.lastKey();
                secondBasketFrequencyMapValue = secondBasketFruitsAndFrequencyMap.get(secondBasketFrequencyMapKey);
                if (secondBasketFrequencyMapValue % 2 != 0 || firstBasketFrequencyMapValue % 2 != 0) {
                    return -1L;
                }

                //minimum cost is
                // either
                // the lowest of the two fruits
                // or
                // 2 times of the minimum value fruit's cost.[once to move first fruit to other side and then the second fruit to different site].

                minimumCost += (
                        (Math.min(firstBasketFrequencyMapValue, secondBasketFrequencyMapValue) / 2)
                                * Math.min(2 * minValueFruit,
                                Math.min(firstBasketFrequencyMapKey,
                                        secondBasketFrequencyMapKey)
                        )
                );

                //adjust the frequency
                if (firstBasketFrequencyMapValue >= secondBasketFrequencyMapValue) {
                    firstBasketFrequencyMapValue -= secondBasketFruitsAndFrequencyMap.remove(secondBasketFrequencyMapKey);
                } else {
                    secondBasketFruitsAndFrequencyMap.put(secondBasketFrequencyMapKey,
                            secondBasketFrequencyMapValue - firstBasketFrequencyMapValue);
                    firstBasketFrequencyMapValue = 0;
                }
            }
        }
        //return the minimumCost;
        return minimumCost;
    }
}
