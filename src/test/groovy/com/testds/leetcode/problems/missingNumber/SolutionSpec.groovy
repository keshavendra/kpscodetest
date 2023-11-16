package com.testds.leetcode.problems.missingNumber

import spock.lang.Specification

class SolutionSpec extends Specification {
    SolutionTest solution

    def setup() {
        solution = new SolutionTest()
    }

    def "Test MissingNumber"() {
        when:
        def actualResult = solution.missingNumber(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                        | expectedResult
        [3, 0, 1]                   | 2
        [0, 1]                      | 2
        [9, 6, 4, 2, 3, 5, 7, 0, 1] | 8
    }
}
