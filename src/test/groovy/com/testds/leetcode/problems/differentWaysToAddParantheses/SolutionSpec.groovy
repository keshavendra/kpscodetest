package com.testds.leetcode.problems.differentWaysToAddParantheses

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test DifferentWaysToAddParantheses"() {
        when:
        def actualResult = solution.diffWaysToCompute(expression)
        then:
        expectedResult == actualResult.sort()
        where:
        expression | expectedResult
        "2-1-1"    | [0, 2]
        "2*3-4*5"  | [-34, -14, -10, -10, 10]
    }

}
