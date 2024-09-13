package com.testds.leetcode.problems.xorQueries

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test XorQueries"() {
        when:
        def actualResult = solution.xorQueries(arr as int[], queries as int[][])
        then:
        expectedResult as int[] == actualResult
        where:
        arr           | queries                          | expectedResult
        [1, 3, 4, 8]  | [[0, 1], [1, 2], [0, 3], [3, 3]] | [2, 7, 14, 8]
        [4, 8, 2, 10] | [[2, 3], [1, 3], [0, 0], [0, 3]] | [8, 0, 4, 4]
    }

}
