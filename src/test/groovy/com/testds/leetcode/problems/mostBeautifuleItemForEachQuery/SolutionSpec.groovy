package com.testds.leetcode.problems.mostBeautifuleItemForEachQuery

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MostBeautifuleItemForEachQuery"() {
        when:
        def actualResult = solution.maximumBeauty(items as int[][], queries as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        items                                    | queries            | expectedResult
        [[1, 2], [3, 2], [2, 4], [5, 6], [3, 5]] | [1, 2, 3, 4, 5, 6] | [2, 4, 5, 5, 6, 6]
        [[1, 2], [1, 2], [1, 3], [1, 4]]         | [1]                | [4]
        [[10, 1000]]                             | [5]                | [0]
    }

    def cleanup() {
        solution = null
    }

}
