package com.testds.leetcode.problems.shiftingLetters

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ShiftingLetters"() {
        when:
        def actualResult = solution.shiftingLetters(s, shifts as int[][])
        then:
        expectedResult == actualResult
        where:
        s      | shifts                            | expectedResult
        "abc"  | [[0, 1, 0], [1, 2, 1], [0, 2, 1]] | "ace"
        "dztz" | [[0, 0, 0], [1, 1, 1]]            | "catz"
    }

}
