package com.testds.leetcode.problems.rangeProductQueriesOfPowers

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test RangeProductQueriesOfPowers"() {
        when:
        def actualResult = solution.productQueries(n, queries as int[][])
        then:
        expectedResult as int[] == actualResult
        where:
        n  | queries                  | expectedResult
        15 | [[0, 1], [2, 2], [0, 3]] | [2, 4, 64]
        2  | [[0, 0]]                 | [2]
    }

    def cleanup() {
        solution = null
    }

}
