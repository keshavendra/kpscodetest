package com.testds.leetcode.problems.lengthOfLIS

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LengthOfLIS"() {
        when:
        def actualResult = solution.lengthOfLIS(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                         | expectedResult
        [10, 9, 2, 5, 3, 7, 101, 18] | 4
        [0, 1, 0, 3, 2, 3]           | 4
        [7, 7, 7, 7, 7, 7, 7]        | 1
    }

}
