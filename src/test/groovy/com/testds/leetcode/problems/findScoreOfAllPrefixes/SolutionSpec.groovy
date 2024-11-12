package com.testds.leetcode.problems.findScoreOfAllPrefixes

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindScoreOfAllPrefixes"() {
        when:
        def actualResult = solution.findPrefixScore(nums as int[])
        then:
        expectedResult as long[] == actualResult
        where:
        nums                | expectedResult
        [2, 3, 7, 5, 10]    | [4, 10, 24, 36, 56]
        [1, 1, 2, 4, 8, 16] | [2, 4, 8, 16, 32, 64]
    }

    def cleanup() {
        solution = null
    }

}
