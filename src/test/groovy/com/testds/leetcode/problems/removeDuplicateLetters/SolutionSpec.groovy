package com.testds.leetcode.problems.removeDuplicateLetters

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test Remove duplicate characters"() {
        when:
        def actualResult = solution.removeDuplicateLetters(s)
        then:
        expectedResult == actualResult
        where:
        s          | expectedResult
        "bcabc"    | "abc"
        "cbacdcbc" | "acdb"
        "abacb"    | "abc"
    }
}
