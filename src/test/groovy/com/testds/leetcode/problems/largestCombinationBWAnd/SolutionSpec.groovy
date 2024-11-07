package com.testds.leetcode.problems.largestCombinationBWAnd

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LargestCombinationBWAnd"() {
        when:
        def actualResult = solution.largestCombination(candidates as int[])
        then:
        expectedResult == actualResult
        where:
        candidates                   | expectedResult
        [16, 17, 71, 62, 12, 24, 14] | 4
        [8, 8]                       | 2
    }

}
