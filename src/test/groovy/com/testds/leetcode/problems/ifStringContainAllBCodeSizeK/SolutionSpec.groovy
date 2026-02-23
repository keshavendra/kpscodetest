package com.testds.leetcode.problems.ifStringContainAllBCodeSizeK

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test HasAllCodes"() {
        when:
        def actualResult = solution.hasAllCodes(s, k)
        then:
        expectedResult == actualResult
        where:
        s          | k | expectedResult
        "00110110" | 2 | true
        "11"       | 1 | false
        "01"       | 1 | true
        "0110"     | 1 | true
        "0110"     | 2 | false
        "00110"    | 2 | true
    }

    def cleanup() {
        solution = null
    }
}
