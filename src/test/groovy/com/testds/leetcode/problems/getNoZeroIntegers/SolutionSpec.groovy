package com.testds.leetcode.problems.getNoZeroIntegers

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test GetNoZeroIntegers"() {
        when:
        def actualResult = solution.getNoZeroIntegers(n)
        then:
        expectedResult as int[] == actualResult
        where:
        n  | expectedResult
        2  | [1, 1]
        11 | [2, 9]
    }

    def cleanup() {
        solution = null
    }

}
