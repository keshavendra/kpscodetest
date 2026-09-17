package com.testds.leetcode.problems.imageOverlap

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LargestOverlap"() {
        when:
        def actualResult = solution.largestOverlap(img1 as int[][], img2 as int[][])
        then:
        expectedResult == actualResult
        where:
        img1                              | img2                              | expectedResult
        [[1, 1, 0], [0, 1, 0], [0, 1, 0]] | [[0, 0, 0], [0, 1, 1], [0, 0, 1]] | 3
        [[1]]                             | [[1]]                             | 1
        [[0]]                             | [[0]]                             | 0
    }

    def cleanup() {
        solution = null
    }

}
