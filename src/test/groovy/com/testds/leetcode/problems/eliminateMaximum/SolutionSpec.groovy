package com.testds.leetcode.problems.eliminateMaximum

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test EliminateMaximum"() {
        when:
        def actualResult = solution.eliminateMaximum(dist as int[], speed as int[])
        then:
        expectedResult == actualResult
        where:
        dist         | speed        | expectedResult
        [1, 3, 4]    | [1, 1, 1]    | 3
        [1, 1, 2, 3] | [1, 1, 1, 1] | 1
        [3, 2, 4]    | [5, 3, 2]    | 1
    }
}
