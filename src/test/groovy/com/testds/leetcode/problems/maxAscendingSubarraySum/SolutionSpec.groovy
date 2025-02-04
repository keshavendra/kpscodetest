package com.testds.leetcode.problems.maxAscendingSubarraySum

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxAscendingSubarraySum"() {
        when:
        def actualResult = solution.maxAscendingSum(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                         | expectedResult
        [10, 20, 30, 5, 10, 50]      | 65
        [10, 20, 30, 40, 50]         | 150
        [12, 17, 15, 13, 10, 11, 12] | 33
    }

}
