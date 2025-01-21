package com.testds.leetcode.problems.firstCompleteIndex

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FirstCompleteIndex"() {
        when:
        def actualResult = solution.firstCompleteIndex(arr as int[], mat as int[][])
        then:
        expectedResult == actualResult
        where:
        arr                         | mat                               | expectedResult
        [1, 3, 4, 2]                | [[1, 4], [2, 3]]                  | 2
        [2, 8, 7, 4, 1, 3, 5, 6, 9] | [[3, 2, 5], [1, 4, 6], [8, 7, 9]] | 3
    }

    def cleanup() {
        solution = null
    }

}
