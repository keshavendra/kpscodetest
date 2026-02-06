package com.testds.leetcode.problems.transformedArray

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test ConstructTransformedArray"() {
        when:
        def actualResult = solution.constructTransformedArray(nums as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        nums          | expectedResult
        [3, -2, 1, 1] | [1, 1, 1, 3]
        [-1, 4, -1]   | [-1, -1, 4]
    }

    def cleanup() {
        solution = null
    }

}
