package com.testds.leetcode.problems.waysToSplitArray

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test WaysToSplitArray"() {
        when:
        def actualResult = solution.waysToSplitArray(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums           | expectedResult
        [10, 4, -8, 7] | 2
        [2, 3, 1, 0]   | 2
    }

    def cleanup() {
        solution = null
    }

}
