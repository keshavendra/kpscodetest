package com.testds.leetcode.problems.maximumHappinessSum

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaximumHappinessSum"() {
        when:
        def actualResult = solution.maximumHappinessSum(happiness as int[], k)
        then:
        expectedResult as long == actualResult
        where:
        happiness    | k | expectedResult
        [1, 2, 3]    | 2 | 4
        [1, 1, 1, 1] | 2 | 1
        [2, 3, 4, 5] | 1 | 5
        [12, 1, 42]  | 3 | 53
    }

}
