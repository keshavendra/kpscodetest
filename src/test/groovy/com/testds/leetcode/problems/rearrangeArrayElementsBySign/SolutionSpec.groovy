package com.testds.leetcode.problems.rearrangeArrayElementsBySign

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test RearrangeArrayElementsBySign"() {
        when:
        def actualResult = solution.rearrangeArray(nums as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        nums                  | expectedResult
        [3, 1, -2, -5, 2, -4] | [3, -2, 1, -5, 2, -4]
        [-1, 1]               | [1, -1]
    }

}
