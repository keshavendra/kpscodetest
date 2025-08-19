package com.testds.leetcode.problems.zeroFilledSubarray

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll("Testing ZeroFilledSubarray with nums #nums and expectedResult #expectedResult")
    def "Test ZeroFilledSubarray"() {
        when:
        def actualResult = solution.zeroFilledSubarray(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                     | expectedResult
        [1, 3, 0, 0, 2, 0, 0, 4] | 6L
        [0, 0, 0, 2, 0, 0]       | 9L
        [2, 10, 2019]            | 0L
    }

    def cleanup() {
        solution = null
    }

}
