package com.testds.leetcode.problems.minimumLengthOfString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinimumLengthOfString"() {
        when:
        def actualResult = solution.minimumLength(s)
        then:
        expectedResult == actualResult
        where:
        s                                                            | expectedResult
        "ca"                                                         | 2
        "cabaabac"                                                   | 0
        "aabccabba"                                                  | 3
        "bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb" | 1
    }

}
