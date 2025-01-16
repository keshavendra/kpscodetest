package com.testds.leetcode.problems.minimizeXor

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinimizeXor"() {
        when:
        def actualResult = solution.minimizeXor(num1, num2)
        then:
        expectedResult == actualResult
        where:
        num1 | num2 | expectedResult
        3    | 5    | 3
        1    | 12   | 3
        25   | 72   | 24
    }

}
