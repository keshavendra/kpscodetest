package com.testds.leetcode.problems.numOfUnplacedFruits

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test NumOfUnplacedFruits"() {
        when:
        def actualResult = solution.numOfUnplacedFruits(fruits as int[], baskets as int[])
        then:
        expectedResult == actualResult
        where:
        fruits    | baskets   | expectedResult
        [4, 2, 5] | [3, 5, 4] | 1
        [3, 6, 1] | [6, 4, 7] | 0
    }

    def cleanup() {
        solution = null
    }
}
