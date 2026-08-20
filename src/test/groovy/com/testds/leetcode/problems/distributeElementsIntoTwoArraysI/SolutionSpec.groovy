package com.testds.leetcode.problems.distributeElementsIntoTwoArraysI

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ResultArray"() {
        when:
        def actualResult = solution.resultArray(nums as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        nums         | expectedResult
        [2, 1, 3]    | [2, 3, 1]
        [5, 4, 3, 8] | [5, 3, 4, 8]
    }

    def cleanup() {
        solution = null
    }

}
