package com.testds.leetcode.problems.stringCompressionII

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test StringCompressionII"() {
        when:
        def actualResult = solution.getLengthOfOptimalCompression(s, k)
        then:
        expectedResult == actualResult
        where:
        s             | k | expectedResult
        "aaabcccd"    | 2 | 4
        "aabbaa"      | 2 | 2
        "aaaaaaaaaaa" | 0 | 3

    }
}
