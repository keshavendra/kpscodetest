package com.testds.leetcode.problems.divideArrayWithMaxDifference

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test DivideArrayWithMaxDifference"() {
        when:
        def actualResult = solution.divideArray(nums as int[], k)
        then:
        expectedResult as int[][] == actualResult
        where:
        nums                                                                           | k | expectedResult
        [1, 3, 4, 8, 7, 9, 3, 5, 1]                                                    | 2 | [[1, 1, 3], [3, 4, 5], [7, 8, 9]]
        [1, 3, 3, 2, 7, 3]                                                             | 3 | []
        [15, 13, 12, 13, 12, 14, 12, 2, 3, 13, 12, 14, 14, 13, 5, 12, 12, 2, 13, 2, 2] | 2 | []
    }

}
