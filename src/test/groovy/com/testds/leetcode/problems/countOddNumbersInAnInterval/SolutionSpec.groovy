package com.testds.leetcode.problems.countOddNumbersInAnInterval

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CountOdds"() {
        when:
        def actualResult = solution.countOdds(low as int, high as int)
        then:
        expectedResult == actualResult
        where:
        low | high | expectedResult
        3   | 7    | 3
        8   | 10   | 1
        8   | 9    | 1
        7   | 8    | 1
    }

    def cleanup() {
        solution = null
    }

}
