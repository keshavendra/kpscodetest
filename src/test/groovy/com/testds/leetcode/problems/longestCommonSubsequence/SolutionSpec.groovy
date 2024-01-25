package com.testds.leetcode.problems.longestCommonSubsequence

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LongestCommonSubsequence"() {
        when:
        def actualResult = solution.longestCommonSubsequence(text1, text2)
        then:
        expectedResult == actualResult
        where:
        text1   | text2 | expectedResult
        "abcde" | "ace" | 3
        "abc"   | "abc" | 3
        "abc"   | "def" | 0
    }

}
