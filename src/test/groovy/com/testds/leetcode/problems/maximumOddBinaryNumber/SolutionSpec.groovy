package com.testds.leetcode.problems.maximumOddBinaryNumber

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaximumOddBinaryNumber"() {
        when:
        def actualResult = solution.maximumOddBinaryNumber(s)
        then:
        expectedResult == actualResult
        where:
        s      | expectedResult
        "010"  | "001"
        "0101" | "1001"
    }

}
