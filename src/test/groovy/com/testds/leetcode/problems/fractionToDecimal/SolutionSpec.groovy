package com.testds.leetcode.problems.fractionToDecimal

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test FractionToDecimal"() {
        when:
        def actualResult = solution.fractionToDecimal(numerator as int, denominator as int)
        then:
        expectedResult == actualResult
        where:
        numerator | denominator | expectedResult
        1         | 2           | "0.5"
        2         | 1           | "2"
        4         | 333         | "0.(012)"
        1         | 6           | "0.1(6)"
        -1        | 2           | "-0.5"
        1         | -2          | "-0.5"
        -1        | -2          | "0.5"
        -1        | -2147483648 | "0.0000000004656612873077392578125"
    }

    def cleanup() {
        solution = null
    }

}
