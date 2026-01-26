package com.testds.leetcode.problems.minimumDifference

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test MinimumDifference"() {
        when:
        def actualResult = solution.minimumDifference(nums as int[], k as int)
        then:
        expectedResult == actualResult
        where:
        nums         | k | expectedResult
        [90]         | 1 | 0
        [9, 4, 1, 7] | 2 | 2
    }

    def cleanup() {
        solution = null
    }

}
