package com.testds.leetcode.problems.largestTriangleArea

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test LargestTriangleArea"() {
        when:
        def actualResult = solution.largestTriangleArea(points as int[][])
        then:
        expectedResult as double == actualResult.round(5)
        where:
        points                                   | expectedResult
        [[0, 0], [0, 1], [1, 0], [0, 2], [2, 0]] | 2.00000
        [[1, 0], [0, 0], [0, 1]]                 | 0.50000
    }

    def cleanup() {
        solution = null
    }

}
