package com.testds.leetcode.problems.minSwaps

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinSwaps"() {
        when:
        def actualResult = solution.minSwaps(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                        | expectedResult
        [0, 1, 0, 1, 1, 0, 0]       | 1
        [0, 1, 1, 1, 0, 0, 1, 1, 0] | 2
        [1, 1, 0, 0, 1]             | 0
    }

}
