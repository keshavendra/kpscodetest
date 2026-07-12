package com.testds.leetcode.problems.rankTransformOfAnArray

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ArrayRankTransform"() {
        when:
        def actualResult = solution.arrayRankTransform(arr as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        arr                                 | expectedResult
        [40, 10, 20, 30]                    | [4, 1, 2, 3]
        [100, 100, 100]                     | [1, 1, 1]
        [37, 12, 28, 9, 100, 56, 80, 5, 12] | [5, 3, 4, 2, 8, 6, 7, 1, 3]
    }

    def cleanup() {
        solution = null
    }

}
