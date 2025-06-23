package com.testds.leetcode.problems.longestSubsequenceInBinaryString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LongestSubsequenceInBinaryString"() {
        when:
        def actualResult = solution.longestSubsequence(s, k)
        then:
        expectedResult == actualResult
        where:
        s          | k | expectedResult
        "1001010"  | 5 | 5
        "00101001" | 1 | 6
    }

}
