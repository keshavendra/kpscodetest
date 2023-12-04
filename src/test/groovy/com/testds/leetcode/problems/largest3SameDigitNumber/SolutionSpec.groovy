package com.testds.leetcode.problems.largest3SameDigitNumber

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test Largest3SameDigitNumber"() {
        when:
        def actualResult = solution.largestGoodInteger(num)
        then:
        expectedResult == actualResult
        where:
        num          | expectedResult
        "6777133339" | "777"
        "2300019"    | "000"
        "42352338"   | ""
    }

}
