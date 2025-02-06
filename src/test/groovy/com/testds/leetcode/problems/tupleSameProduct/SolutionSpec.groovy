package com.testds.leetcode.problems.tupleSameProduct

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test TupleSameProduct"() {
        when:
        def actualResult = solution.tupleSameProduct(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                | expectedResult
        [2, 3, 4, 6]        | 8
        [1, 2, 4, 5, 10]    | 16
        [2, 3, 4, 6, 8, 12] | 40
    }

    def cleanup() {
        solution = null
    }

}
