package com.testds.leetcode.problems.primeNumOfSetBits

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test CountPrimeSetBits"() {
        when:
        def actualResult = solution.countPrimeSetBits(left, right)
        then:
        expectedResult == actualResult
        where:
        left | right | expectedResult
        6    | 10    | 4
        10   | 15    | 5
    }

    def cleanup() {
        solution = null
    }
}
