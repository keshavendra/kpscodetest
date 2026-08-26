package com.testds.leetcode.problems.shortBeautiSubStr

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ShortestBeautifulSubstring"() {
        when:
        def actualResult = solution.shortestBeautifulSubstring(s, k)
        then:
        expectedResult == actualResult
        where:
        s                   | k | expectedResult
        "100011001"         | 3 | "11001"
        "1011"              | 2 | "11"
        "000"               | 1 | ""
        "01011101000111110" | 5 | "11111"
    }

    def cleanup() {
        solution = null
    }

}
