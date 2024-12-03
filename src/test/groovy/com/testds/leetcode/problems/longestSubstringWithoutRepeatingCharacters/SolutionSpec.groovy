package com.testds.leetcode.problems.longestSubstringWithoutRepeatingCharacters

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LengthOfLongestSubstring"() {
        when:
        def actualResult = solution.lengthOfLongestSubstring(s)
        then:
        expectedResult == actualResult
        where:
        s          | expectedResult
        "abcabcbb" | 3
        "bbbbb"    | 1
        "pwwkew"   | 3
    }

    def cleanup() {
        solution = null
    }

}
