package com.testds.leetcode.problems.maxDifferenceOddEvenFreq

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxDifference"() {
        when:
        def actualResult = solution.maxDifference(s)
        then:
        expectedResult == actualResult
        where:
        s          | expectedResult
        "aaaaabbc" | 3
        "abcabcab" | 1
        "tzt"      | -1
    }

    def cleanup() {
        solution = null
    }

}
