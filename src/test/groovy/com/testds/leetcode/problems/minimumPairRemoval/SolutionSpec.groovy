package com.testds.leetcode.problems.minimumPairRemoval

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test MinimumPairRemoval"() {
        when:
        def actualResult = solution.minimumPairRemoval(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums         | expectedResult
        [5, 2, 3, 1] | 2
        [1, 2, 2]    | 0
    }

    def cleanup() {
        solution = null
    }

}
