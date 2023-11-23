package com.testds.leetcode.problems.checkArithmeticSubarrays

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CheckArithmeticSubarrays"() {
        when:
        def actualResult = solution.checkArithmeticSubarrays(nums as int[], l as int[], r as int[])
        then:
        expectedResult == actualResult
        where:
        nums                                               | l                  | r                   | expectedResult
        [4, 6, 5, 9, 3, 7]                                 | [0, 0, 2]          | [2, 3, 5]           | [true, false, true]
        [-12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10] | [0, 1, 6, 4, 8, 7] | [4, 4, 9, 7, 9, 10] | [false, true, false, false, true, true]
    }

}
