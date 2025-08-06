package com.testds.leetcode.problems.fruitsIntoBaskets3

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
        [59, 59]  | [27, 46]  | 2
        [3, 6, 1] | [6, 4, 7] | 0
        [4, 2, 5] | [3, 5, 4] | 1
    }

}
