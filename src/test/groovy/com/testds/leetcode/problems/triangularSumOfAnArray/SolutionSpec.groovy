package com.testds.leetcode.problems.triangularSumOfAnArray

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test TriangularSum"() {
        when:
        def actualResult = solution.triangularSum(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums            | expectedResult
        [1, 2, 3, 4, 5] | 8
        [5]             | 5
    }

}
