package com.testds.leetcode.problems.minDiffBwMaxAndMin

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinDiffBwMaxAndMin"() {
        when:
        def actualResult = solution.minDifference(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                    | expectedResult
        [9, 48, 92, 48, 81, 31] | 17
        [5, 3, 2, 4]            | 0
        [1, 5, 0, 10, 14]       | 1
        [3, 100, 20]            | 0
    }

}
