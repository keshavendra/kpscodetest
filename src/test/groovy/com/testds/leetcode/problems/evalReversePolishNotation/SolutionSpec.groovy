package com.testds.leetcode.problems.evalReversePolishNotation

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test EvalReversePolishNotation"() {
        when:
        def actualResult = solution.evalRPN(tokens as String[])
        then:
        expectedResult == actualResult
        where:
        tokens                                                                | expectedResult
        ["2", "1", "+", "3", "*"]                                             | 9
        ["4", "13", "5", "/", "+"]                                            | 6
        ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"] | 22
    }

}
