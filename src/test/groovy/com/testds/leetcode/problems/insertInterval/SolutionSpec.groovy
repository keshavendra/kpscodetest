package com.testds.leetcode.problems.insertInterval

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test InsertInterval"() {
        when:
        def actualResult = solution.insert(intervals as int[][], newInterval as int[])
        then:
        expectedResult as int[][] == actualResult
        where:
        intervals                                   | newInterval | expectedResult
        [[1, 3], [6, 9]]                            | [2, 5]      | [[1, 5], [6, 9]]
        [[1, 2], [3, 5], [6, 7], [8, 10], [12, 16]] | [4, 8]      | [[1, 2], [3, 10], [12, 16]]
        []                                          | [5, 7]      | [[5, 7]]
    }

}
