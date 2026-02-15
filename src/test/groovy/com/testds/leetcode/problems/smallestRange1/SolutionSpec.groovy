package com.testds.leetcode.problems.smallestRange1

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test SmallestRangeI"() {
        when:
        def actualResult = solution.smallestRangeI(nums as int[], k as int)
        then:
        expectedResult == actualResult
        where:
        nums      | k | expectedResult
        [1]       | 0 | 0
        [0, 10]   | 2 | 6
        [1, 3, 6] | 3 | 0
    }

    def cleanup() {
        solution = null
    }

}
