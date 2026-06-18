package com.testds.leetcode.problems.calculateAngleBetweenHands

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test AngleClock"() {
        when:
        def actualResult = solution.angleClock(hour as int, minute as int)
        then:
        expectedResult as double == actualResult
        where:
        hour | minute | expectedResult
        12   | 30     | 165
        3    | 30     | 75
        3    | 15     | 7.5
    }

}
