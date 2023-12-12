package com.testds.leetcode.problems.maxProductInArray

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxProductInArray"() {
        when:
        def actualResult = solution.maxProduct(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums         | expectedResult
        [3, 4, 5, 2] | 12
        [1, 5, 4, 5] | 16
        [3, 7]       | 12
    }

}
