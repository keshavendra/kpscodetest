package com.testds.leetcode.problems.chalkReplacer

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ChalkReplacer"() {
        when:
        def actualResult = solution.chalkReplacer(chalk as int[], k)
        then:
        expectedResult == actualResult
        where:
        chalk        | k  | expectedResult
        [5, 1, 5]    | 22 | 0
        [3, 4, 1, 2] | 25 | 1
    }

}
