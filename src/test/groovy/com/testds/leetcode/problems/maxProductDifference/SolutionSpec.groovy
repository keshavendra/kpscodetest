package com.testds.leetcode.problems.maxProductDifference

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxProductDifference"() {
        when:
        def actualResult = solution.maxProductDifference(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                  | expectedResult
        [5, 6, 2, 7, 4]       | 34
        [4, 2, 5, 9, 7, 4, 8] | 64
    }

}
