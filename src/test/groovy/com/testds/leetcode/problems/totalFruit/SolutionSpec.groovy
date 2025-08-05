package com.testds.leetcode.problems.totalFruit

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test TotalFruit"() {
        when:
        def actualResult = solution.totalFruit(fruits as int[])
        then:
        expectedResult == actualResult
        where:
        fruits                            | expectedResult
        [1, 2, 1]                         | 3
        [0, 1, 2, 2]                      | 3
        [1, 2, 3, 2, 2]                   | 4
        [3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4] | 5
        [1, 0, 3, 4, 3]                   | 3
        [0, 1, 1, 4, 3]                   | 3
    }

    def cleanup() {
        solution = null
    }

}
