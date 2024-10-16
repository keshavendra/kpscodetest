package com.testds.leetcode.problems.longestDiverseString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LongestDiverseString"() {
        when:
        def actualResult = solution.longestDiverseString(a, b, c)
        then:
        actualResult.length() == possibleResult.length()
        validate(actualResult, a, b, c)
        where:
        a | b | c  | possibleResult
        1 | 1 | 7  | "ccaccbcc"
        7 | 1 | 0  | "aabaa"
        0 | 8 | 11 | "ccbccbcbcbcbcbcbcbc"

    }

    def validate(def actualResult, int a, int b, int c) {
        return !actualResult.contains("aaa") &&
                !actualResult.contains("bbb") &&
                !actualResult.contains("ccc") &&
                actualResult.count("a") <= a &&
                actualResult.count("b") <= b &&
                actualResult.count("c") <= c
    }

    def cleanup() {
        solution = null
    }

}
