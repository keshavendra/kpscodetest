package com.testds.leetcode.problems.minStepsToMakeAnnagram

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinStepsToMakeAnnagram"() {
        when:
        def actualResult = solution.minSteps(s, t)
        then:
        expectedResult == actualResult
        where:
        s          | t          | expectedResult
        "bab"      | "aba"      | 1
        "leetcode" | "practice" | 5
        "anagram"  | "mangaar"  | 0
    }

}
