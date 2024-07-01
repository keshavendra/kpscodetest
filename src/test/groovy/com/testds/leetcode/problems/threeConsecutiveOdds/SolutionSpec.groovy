package com.testds.leetcode.problems.threeConsecutiveOdds

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ThreeConsecutiveOdds"() {
        when:
        def actualResult = solution.threeConsecutiveOdds(arr as int[])
        then:
        expectedResult == actualResult
        where:
        arr                            | expectedResult
        [2, 6, 4, 1]                   | false
        [1, 2, 34, 3, 4, 5, 7, 23, 12] | true
        [1, 1, 1]                      | true
    }

}
