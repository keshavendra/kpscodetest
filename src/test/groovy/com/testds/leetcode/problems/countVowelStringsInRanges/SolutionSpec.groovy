package com.testds.leetcode.problems.countVowelStringsInRanges

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CountVowelStringsInRanges"() {
        when:
        def actualResult = solution.vowelStrings(words as String[], queries as int[][])
        then:
        expectedResult as int[] == actualResult
        where:
        words                            | queries                  | expectedResult
        ["aba", "bcb", "ece", "aa", "e"] | [[0, 2], [1, 4], [1, 1]] | [2, 3, 0]
        ["a", "e", "i"]                  | [[0, 2], [0, 1], [2, 2]] | [3, 2, 1]
    }

    def cleanup() {
        solution = null
    }
}
