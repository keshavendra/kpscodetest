package com.testds.leetcode.problems.countUniqueSubsequencesLen3

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CountUniqueSubsequencesLen3"() {
        when:
        def actualResult = solution.countPalindromicSubsequence(s)
        then:
        expectedResult == actualResult
        where:
        s         | expectedResult
        "aabca"   | 3
        "adc"     | 0
        "bbcbaba" | 4
    }

    def cleanup() {
        solution = null
    }

}
