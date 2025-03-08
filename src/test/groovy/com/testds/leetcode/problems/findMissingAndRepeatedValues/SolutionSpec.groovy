package com.testds.leetcode.problems.findMissingAndRepeatedValues

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindMissingAndRepeatedValues"() {
        when:
        def actualResult = solution.findMissingAndRepeatedValues(grid as int[][])
        then:
        expectedResult as int[] == actualResult
        where:
        grid                              | expectedResult
        [[1, 3], [2, 2]]                  | [2, 4]
        [[9, 1, 7], [8, 9, 2], [3, 4, 6]] | [9, 5]
    }

    def cleanup() {
        solution = null
    }

}
