package com.testds.leetcode.problems.canBeValidParantheses

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CanBeValidParantheses"() {
        when:
        def actualResult = solution.canBeValid(s, locked)
        then:
        expectedResult == actualResult
        where:
        s        | locked   | expectedResult
        "))()))" | "010100" | true
        "()()"   | "0000"   | true
        ")"      | "0"      | false
    }

    def cleanup() {
        solution = null
    }

}
