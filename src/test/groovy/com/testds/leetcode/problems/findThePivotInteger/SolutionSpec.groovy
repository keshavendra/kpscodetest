package com.testds.leetcode.problems.findThePivotInteger

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindThePivotInteger"() {
        when:
        def actualResult = solution.pivotInteger(n)
        then:
        expectedResult == actualResult
        where:
        n | expectedResult
        8 | 6
        1 | 1
        4 | -1
    }

}
