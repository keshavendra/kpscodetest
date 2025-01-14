package com.testds.leetcode.problems.findThePrefixCommonArray

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindThePrefixCommonArray"() {
        when:
        def actualResult = solution.findThePrefixCommonArray(A as int[], B as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        A            | B            | expectedResult
        [1, 3, 2, 4] | [3, 1, 2, 4] | [0, 2, 3, 4]
        [2, 3, 1]    | [3, 1, 2]    | [0, 1, 3]
    }

    def cleanup() {
        solution = null
    }

}
