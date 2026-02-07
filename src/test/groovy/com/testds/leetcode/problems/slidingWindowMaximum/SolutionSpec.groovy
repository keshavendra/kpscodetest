package com.testds.leetcode.problems.slidingWindowMaximum

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test SlidingWindowMaximum"() {
        when:
        def actualResult = solution.maxSlidingWindow(nums as int[], k)
        then:
        expectedResult as int[] == actualResult
        where:
        nums                       | k | expectedResult
        [1, 3, -1, -3, 5, 3, 6, 7] | 3 | [3, 3, 5, 5, 6, 7]
        [1]                        | 1 | [1]
    }

    def cleanup() {
        solution = null
    }

}
