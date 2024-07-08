package com.testds.leetcode.problems.findTheWinner

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindTheWinner"() {
        when:
        def actualResult = solution.findTheWinner(n, k)
        then:
        expectedResult == actualResult
        where:
        n | k | expectedResult
        5 | 2 | 3
        6 | 5 | 1
    }

}
