package com.testds.leetcode.problems.minInsertions

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinInsertions"() {
        when:
        def actualResult = solution.minInsertions(s)
        then:
        expectedResult == actualResult
        where:
        s        | expectedResult
        "(()))"  | 1
        "())"    | 0
        "))())(" | 3
        ""       | 0
        "("      | 2
        ")"      | 2
        "))"     | 1
        "()"     | 1
        "()("    | 3
        "()()"   | 2
        "(())))" | 0
        "((((("  | 10
        ")))))))" | 5
    }

    def "Handles long inputs without a stack"() {
        expect:
        solution.minInsertions("(" * 100000) == 200000
        solution.minInsertions(")" * 100000) == 50000
        solution.minInsertions("())" * 33333) == 0
    }
}
