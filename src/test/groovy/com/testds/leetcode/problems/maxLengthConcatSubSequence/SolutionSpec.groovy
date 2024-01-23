package com.testds.leetcode.problems.maxLengthConcatSubSequence

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxLengthConcatSubSequence"() {
        when:
        def actualResult = solution.maxLength(arr)
        then:
        expectedResult == actualResult
        where:
        arr                            | expectedResult
        ["un", "iq", "ue"]             | 4
        ["cha", "r", "act", "ers"]     | 6
        ["abcdefghijklmnopqrstuvwxyz"] | 26
    }

}
