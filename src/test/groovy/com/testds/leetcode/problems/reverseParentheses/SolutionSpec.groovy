package com.testds.leetcode.problems.reverseParentheses

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ReverseParentheses"() {
        when:
        def actualResult = solution.reverseParentheses(s)
        then:
        expectedResult == actualResult
        where:
        s                | expectedResult
        "(abcd)"         | "dcba"
        "(u(love)i)"     | "iloveu"
        "(ed(et(oc))el)" | "leetcode"
    }

}
