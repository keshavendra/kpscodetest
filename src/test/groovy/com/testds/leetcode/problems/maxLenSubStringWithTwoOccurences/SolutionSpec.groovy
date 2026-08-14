package com.testds.leetcode.problems.maxLenSubStringWithTwoOccurences

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaximumLengthSubstring"() {
        when:
        def actualResult = solution.maximumLengthSubstring(s)
        then:
        expectedResult == actualResult
        where:
        s          | expectedResult
        "bcbbbcba" | 4
        "aaaa"     | 2
    }

}
