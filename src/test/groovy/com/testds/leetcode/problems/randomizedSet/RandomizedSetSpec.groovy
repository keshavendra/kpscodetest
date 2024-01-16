package com.testds.leetcode.problems.randomizedSet

import spock.lang.Specification

class RandomizedSetSpec extends Specification {

    RandomizedSet randomizedSet

    def setup() {
        randomizedSet = new RandomizedSet()
    }

    def "Test RandomizedSet"() {
        when:
        def actualResult = []
        for (int i = 0; i < method.size(); i++) {
            def result = null
            switch (method.get(i)) {
                case "RandomizedSet":
                    randomizedSet = new RandomizedSet()
                    break
                case "insert":
                    result = randomizedSet.insert(input.get(i).get(0))
                    break
                case "remove":
                    result = randomizedSet.remove(input.get(i).get(0))
                    break
                case "getRandom":
                    result = randomizedSet.getRandom()
            }

            actualResult.add(result)
        }
        then:
        for (int i = 0; i < method.size(); i++) {
            if ("getRandom" != method.get(i))
                output.get(i) == actualResult.get(i)
            else
                assert actualResult.get(i)
        }
        where:
        method                                                                                        | input                                 | output
        ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"] | [[], [1], [2], [2], [], [1], [2], []] | [null, true, false, true, 2, true, false, 2]
    }

}
