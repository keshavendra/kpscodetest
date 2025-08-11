package com.testds.leetcode.problems.reverseWords


import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ReverseWords"() {
        when:
        def actualResult = solution.reverseWords(s)
        then:
        expectedResult == actualResult
        where:
        s                 | expectedResult
        "the sky is blue" | "blue is sky the"
        "  hello world  " | "world hello"
    }

    def cleanup() {
        solution = null
    }

}
