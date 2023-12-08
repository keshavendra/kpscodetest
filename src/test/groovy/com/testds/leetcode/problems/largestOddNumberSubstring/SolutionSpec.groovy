package com.testds.leetcode.problems.largestOddNumberSubstring

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LargestOddNumberSubstring"() {
        when:
        def actualResult = solution.largestOddNumber(num)
        then:
        expectedResult == actualResult
        where:
        num     | expectedResult
        "52"    | "5"
        "4206"  | ""
        "35427" | "35427"
    }

}
