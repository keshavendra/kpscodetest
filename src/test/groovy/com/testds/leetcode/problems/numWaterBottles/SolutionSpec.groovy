package com.testds.leetcode.problems.numWaterBottles

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test NumWaterBottles"() {
        when:
        def actualResult = solution.numWaterBottles(numBottles, numExchange)
        then:
        expectedResult == actualResult
        where:
        numBottles | numExchange | expectedResult
        1          | 3           | 1
        3          | 3           | 4
        5          | 3           | 7
        9          | 3           | 13
        15         | 4           | 19
    }

}
