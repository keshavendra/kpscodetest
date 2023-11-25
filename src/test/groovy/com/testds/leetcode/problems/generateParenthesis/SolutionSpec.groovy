package com.testds.leetcode.problems.generateParenthesis

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test GenerateParenthesis"() {
        when:
        def actualResult = solution.generateParenthesis(n)
        then:
        expectedResult.containsAll(actualResult)
        actualResult.containsAll(expectedResult)
        where:
        n | expectedResult
        3 | ["((()))", "(()())", "(())()", "()(())", "()()()"]
        1 | ["()"]
        4 | ["(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"]
    }

}
