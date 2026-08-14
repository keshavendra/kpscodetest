package com.testds.leetcode.problems.validSequenceForWords

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ValidSequence"() {
        when:
        def actualResult = solution.validSequence(word1, word2)
        then:
        expectedResult as int[] == actualResult
        where:
        word1   | word2 | expectedResult
        "vbcca" | "abc" | [0, 1, 2]
        "bacdc" | "abc" | [1, 2, 4]
    }

    def cleanup() {
        solution = null
    }

}
