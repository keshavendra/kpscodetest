package com.testds.leetcode.problems.minBitFlips

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinBitFlips"() {
        when:
        def actualResult = solution.minBitFlips(start, goal)
        then:
        expectedResult == actualResult
        where:
        start | goal | expectedResult
        10    | 7    | 3
        3     | 4    | 3

    }

}
