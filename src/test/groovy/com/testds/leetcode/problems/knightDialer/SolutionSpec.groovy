package com.testds.leetcode.problems.knightDialer

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test KnightDialer"() {
        when:
        def actualResult = solution.knightDialer(n)
        then:
        expectedResult == actualResult
        where:
        n    | expectedResult
        1    | 10
        2    | 20
        3131 | 136006598
    }

}
