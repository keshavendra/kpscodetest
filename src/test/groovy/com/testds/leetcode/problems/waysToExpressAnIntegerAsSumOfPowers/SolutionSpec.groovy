package com.testds.leetcode.problems.waysToExpressAnIntegerAsSumOfPowers

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll("Running test for #n , #x and #expectedResult")
    def "Test NumberOfWays"() {
        when:
        def actualResult = solution.numberOfWays(n, x)
        then:
        expectedResult == actualResult
        where:
        n   | x  | expectedResult
        10  | 2  | 1
        4   | 1  | 2
        103 | 1  | 570078
        0   | -1 | 1
    }

    def cleanup() {
        solution = null
    }

}
