package com.testds.leetcode.problems.maxSumSubArrayOfSizeK

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxSumSubArrayOfSizeK"() {
        when:
        def actualResult = solution.maximumSubarraySum(nums as int[], k)
        then:
        expectedResult as long == actualResult
        where:
        nums                  | k | expectedResult
        [1, 5, 4, 2, 9, 9, 9] | 3 | 15
        [4, 4, 4]             | 3 | 0

    }

}
