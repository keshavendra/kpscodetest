package com.testds.leetcode.problems.heightChecker

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test HeightChecker"() {
        when:
        def actualResult = solution.heightChecker(heights as int[])
        then:
        expectedResult == actualResult
        where:
        heights            | expectedResult
        [1, 1, 4, 2, 1, 3] | 3
        [5, 1, 2, 3, 4]    | 5
        [1, 2, 3, 4, 5]    | 0
    }

}
