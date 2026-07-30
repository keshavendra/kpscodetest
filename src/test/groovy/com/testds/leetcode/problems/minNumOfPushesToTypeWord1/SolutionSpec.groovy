package com.testds.leetcode.problems.minNumOfPushesToTypeWord1

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinimumPushes"() {
        when:
        def actualResult = solution.minimumPushes(word)
        then:
        expectedResult == actualResult
        where:
        word                        | expectedResult
        "abcde"                     | 5
        "xycdefghij"                | 12
        "amrvxnhsewkoipjyuclgtdbfq" | 52
    }

    def cleanup() {
        solution = null
    }

}
