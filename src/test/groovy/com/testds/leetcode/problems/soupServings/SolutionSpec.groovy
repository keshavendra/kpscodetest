package com.testds.leetcode.problems.soupServings

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SoupServings"() {
        when:
        def actualResult = solution.soupServings(n)
        then:
        expectedResult as double == actualResult
        where:
        n   | expectedResult
        50  | 0.62500
        100 | 0.71875
    }

    def cleanup() {
        solution = null
    }

}
