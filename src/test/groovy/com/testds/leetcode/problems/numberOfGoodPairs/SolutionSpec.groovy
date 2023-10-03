package com.testds.leetcode.problems.numberOfGoodPairs

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test NumIdentical Pairs"() {
        when:
        def actualResult = solution.numIdenticalPairs(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums               | expectedResult
        [1, 2, 3, 1, 1, 3] | 4
        [1, 1, 1, 1]       | 6
        [1, 2, 3]          | 0
    }
}
