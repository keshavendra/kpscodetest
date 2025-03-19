package com.testds.leetcode.problems.minOperationsToMakeAll1sInBinaryArray

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinOperation"() {
        when:
        def actualResult = solution.minOperations(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums               | expectedResult
        [0, 1, 1, 1, 0, 0] | 3
        [0, 1, 1, 1]       | -1
    }

    def cleanup() {
        solution = null
    }

}
