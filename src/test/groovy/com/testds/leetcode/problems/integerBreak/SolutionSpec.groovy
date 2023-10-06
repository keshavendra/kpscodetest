package com.testds.leetcode.problems.integerBreak

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test integerBreak"() {
        when:
        def actualResult = solution.integerBreak(n)
        then:
        expectedResult == actualResult
        where:
        n  | expectedResult
        1  | 1
        10 | 36
    }

    def "Test integerBreak1"() {
        when:
        def actualResult = solution.integerBreak1(n)
        then:
        expectedResult == actualResult
        where:
        n  | expectedResult
        1  | 1
        10 | 36
    }
}
