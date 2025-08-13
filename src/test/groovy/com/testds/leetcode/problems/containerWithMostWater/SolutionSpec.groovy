package com.testds.leetcode.problems.containerWithMostWater

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll("Test Max Area with height array #height and expectedResult #expectedResult")
    def "Test MaxArea"() {
        when:
        def actualResult = solution.maxArea(height as int[])
        then:
        expectedResult == actualResult
        where:
        height                      | expectedResult
        [1, 8, 6, 2, 5, 4, 8, 3, 7] | 49
        [1, 1]                      | 1
    }

    def cleanup() {
        solution = null
    }
}
