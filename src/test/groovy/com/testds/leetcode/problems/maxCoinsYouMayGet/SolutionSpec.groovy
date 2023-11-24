package com.testds.leetcode.problems.maxCoinsYouMayGet

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxCoins"() {
        when:
        def actualResult = solution.maxCoins(piles as int[])
        then:
        expectedResult == actualResult
        where:
        piles                       | expectedResult
        [2, 4, 1, 2, 7, 8]          | 9
        [2, 4, 5]                   | 4
        [9, 8, 7, 6, 5, 1, 2, 3, 4] | 18
    }

}
