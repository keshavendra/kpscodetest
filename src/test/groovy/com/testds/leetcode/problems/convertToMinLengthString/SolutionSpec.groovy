package com.testds.leetcode.problems.convertToMinLengthString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ConvertToMinLengthString"() {
        when:
        def actualResult = solution.minimumLength(s)
        then:
        expectedResult == actualResult
        where:
        s           | expectedResult
        "abaacbcbb" | 5
        "aa"        | 2
    }

    def cleanup() {
        solution = null
    }

}
