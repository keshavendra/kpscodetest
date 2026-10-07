package com.testds.leetcode.problems.scoreOfParentheses

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ScoreOfParentheses"() {
        when:
        def actualResult = solution.scoreOfParentheses(s)
        then:
        expectedResult == actualResult
        where:
        s        | expectedResult
        "()"     | 1
        "()()"   | 2
        "(())"   | 2
        "((()))" | 4
    }

    def cleanup(){
        solution = null
    }

}
