package com.testds.leetcode.problems.maxScoreAfterSplittingAString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxScoreAfterSplittingAString"() {
        when:
        def actualResult = solution.maxScore(s)
        then:
        expectedResult == actualResult
        where:
        s        | expectedResult
        "011101" | 5
        "00111"  | 5
        "1111"   | 3
    }

}
