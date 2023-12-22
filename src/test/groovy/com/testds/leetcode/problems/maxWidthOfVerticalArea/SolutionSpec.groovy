package com.testds.leetcode.problems.maxWidthOfVerticalArea

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxWidthOfVerticalArea"() {
        when:
        def actualResult = solution.maxWidthOfVerticalArea(points as int[][])
        then:
        expectedResult == actualResult
        where:
        points                                           | expectedResult
        [[8, 7], [9, 9], [7, 4], [9, 7]]                 | 1
        [[3, 1], [9, 0], [1, 0], [1, 4], [5, 3], [8, 8]] | 3
    }

}
