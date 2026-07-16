package com.testds.leetcode.problems.sumOfGcdOfFormedPairs

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test GcdSum"() {
        when:
        def actualResult = solution.gcdSum(nums as int[])
        then:
        expectedResult as long == actualResult
        where:
        nums         | expectedResult
        [2, 6, 4]    | 2
        [3, 6, 2, 8] | 5
    }

    def cleanup() {
        solution = null
    }

}
