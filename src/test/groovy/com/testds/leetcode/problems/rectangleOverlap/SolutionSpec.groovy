package com.testds.leetcode.problems.rectangleOverlap

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test IsRectangleOverlap"() {
        when:
        def actualResult = solution.isRectangleOverlap(rec1 as int[], rec2 as int[])
        then:
        actualResult == expectedResult
        where:
        rec1         | rec2         | expectedResult
        [0, 0, 2, 2] | [1, 1, 3, 3] | true
        [0, 0, 1, 1] | [1, 0, 2, 1] | false
        [0, 0, 1, 1] | [2, 2, 3, 3] | false
    }

    def cleanup() {
        solution = null
    }

}
