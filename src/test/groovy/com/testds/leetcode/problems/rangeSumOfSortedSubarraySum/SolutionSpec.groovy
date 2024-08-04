package com.testds.leetcode.problems.rangeSumOfSortedSubarraySum

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test RangeSumOfSortedSubarraySum"() {
        when:
        def actualResult = solution.rangeSum(nums as int[], n, left, right)
        then:
        expectedResult == actualResult
        where:
        nums         | n | left | right | expectedResult
        [1, 2, 3, 4] | 4 | 1    | 5     | 13
        [1, 2, 3, 4] | 4 | 3    | 4     | 6
        [1, 2, 3, 4] | 4 | 1    | 10    | 50
    }

}
