package com.testds.leetcode.problems.numSubMatrics

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll("Running with Matrix #mat and expectedResult #expectedResult")
    def "Test NumSubmat"() {
        when:
        def actualResult = solution.numSubmat(mat as int[][])
        then:
        expectedResult == actualResult
        where:
        mat                                        | expectedResult
        [[1, 0, 1], [1, 1, 0], [1, 1, 0]]          | 13
        [[0, 1, 1, 0], [0, 1, 1, 1], [1, 1, 1, 0]] | 24
    }

    def cleanup() {
        solution = null
    }

}
