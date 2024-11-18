package com.testds.leetcode.problems.defuseTheBomb

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test DefuseTheBomb"() {
        when:
        def actualResult = solution.decrypt(code as int[], k)
        then:
        expectedResult as int[] == actualResult
        where:
        code         | k  | expectedResult
        [5, 7, 1, 4] | 3  | [12, 10, 16, 13]
        [1, 2, 3, 4] | 0  | [0, 0, 0, 0]
        [2, 4, 9, 3] | -2 | [12, 5, 6, 13]

    }

    def cleanup() {
        solution = null
    }

}
