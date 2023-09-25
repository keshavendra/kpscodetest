package com.testds.leetcode.problems.countPairsOfSimilarStrings

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test Similar Pairs"() {
        when:
        def actualResult = solution.similarPairs(words as String[])
        then:
        expectedResult == actualResult
        where:
        words                                  | expectedResult
        ["aba", "aabb", "abcd", "bac", "aabc"] | 2
        ["aabb", "ab", "ba"]                   | 3
        ["nba", "cba", "dba"]                  | 0
    }
}
