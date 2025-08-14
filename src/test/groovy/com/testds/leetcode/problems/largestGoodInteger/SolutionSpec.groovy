package com.testds.leetcode.problems.largestGoodInteger

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll("Testing LargestGoodInteger for num #num and expectedResult #expectedResult")
    def "Test LargestGoodInteger"() {
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

    def cleanup() {
        solution = null
    }

}
