package com.testds.leetcode.problems.minScoreTriangulation

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinScoreTriangulation"() {
        when:
        def actualResult = solution.minScoreTriangulation(values as int[])
        then:
        expectedResult == actualResult
        where:
        values             | expectedResult
        [1, 2, 3]          | 6
        [3, 7, 4, 5]       | 144
        [1, 3, 1, 4, 1, 5] | 13
        [2, 1, 4, 4]       | 24
    }

    def cleanup() {
        solution = null
    }

}
