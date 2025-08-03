package com.testds.leetcode.problems.rearrangeFruits

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinCost"() {
        when:
        def actualResult = solution.minCost(basket1 as int[], basket2 as int[])
        then:
        expectedResult as long == actualResult
        where:
        basket1                                  | basket2                                  | expectedResult
        [4, 2, 2, 2]                             | [1, 4, 1, 2]                             | 1
        [2, 3, 4, 1]                             | [3, 2, 5, 1]                             | -1
        [4, 4, 4, 4, 3]                          | [5, 5, 5, 5, 3]                          | 8
        [84, 80, 43, 8, 80, 88, 43, 14, 100, 88] | [32, 32, 42, 68, 68, 100, 42, 84, 14, 8] | 48
    }

    def cleanup() {
        solution = null
    }

}
