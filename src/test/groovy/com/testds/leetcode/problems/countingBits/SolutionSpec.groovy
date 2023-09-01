package com.testds.leetcode.problems.countingBits

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test countingBits with different inputs"() {
        when:
        def actualResult = solution.countBits(n)
        then:
        expectedResult.containsAll(actualResult)
        where:
        n | expectedResult
        2 | [0, 1, 1]
        5 | [0, 1, 1, 2, 1, 2]
    }
}
