package com.testds.leetcode.problems.singleSwapForMaxNum

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaximumSwap"() {
        when:
        def actualResult = solution.maximumSwap(num)
        then:
        expectedResult == actualResult
        where:
        num  | expectedResult
        2736 | 7236
        9973 | 9973
    }

    def cleanup() {
        solution = null
    }

}
