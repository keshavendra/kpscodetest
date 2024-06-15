package com.testds.leetcode.problems.minIncrementForUnique

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinIncrementForUnique"() {
        when:
        def actualResult = solution.minIncrementForUnique(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums               | expectedResult
        [1, 2, 2]          | 1
        [3, 2, 1, 2, 1, 7] | 6
    }

}
