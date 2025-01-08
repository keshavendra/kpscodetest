package com.testds.leetcode.problems.countPrefixSuffixPairs

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CountPrefixSuffixPairs"() {
        when:
        def actualResult = solution.countPrefixSuffixPairs(words as String[])
        then:
        expectedResult == actualResult
        where:
        words                        | expectedResult
        ["a", "aba", "ababa", "aa"]  | 4
        ["pa", "papa", "ma", "mama"] | 2
        ["abab", "ab"]               | 0
    }

    def cleanup() {
        solution = null
    }

}
