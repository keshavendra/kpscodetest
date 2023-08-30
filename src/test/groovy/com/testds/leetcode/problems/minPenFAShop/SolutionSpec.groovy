package com.testds.leetcode.problems.minPenFAShop

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "test different inputs and respectively expected results"() {
        when:
        def actualResult = solution.bestClosingTime(inputString)
        then:
        actualResult == expectedResult
        where:
        inputString | expectedResult
        "YYNY"      | 2
        "NNNNN"     | 0
        "YYYY"      | 4
    }
}
