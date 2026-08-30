package com.testds.leetcode.problems.minimumDeletions

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinimumDeletions"() {
        when:
        def actualResult = solution.minimumDeletions(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                         | expectedResult
        [2, 10, 7, 5, 4, 1, 8, 6]    | 5
        [0, -4, 19, 1, 8, -2, -3, 5] | 3
        [101]                        | 1
    }

    def cleanup() {
        solution = null
    }

}
