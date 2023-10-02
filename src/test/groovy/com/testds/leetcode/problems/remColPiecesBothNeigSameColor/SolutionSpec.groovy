package com.testds.leetcode.problems.remColPiecesBothNeigSameColor

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test remove-colored-pieces-if-both-neighbors-are-the-same-color"() {
        when:
        def actualResult = solution.winnerOfGame(colors)
        then:
        expectedResult == actualResult
        where:
        colors        | expectedResult
        "AAABABB"     | true
        "AA"          | false
        "ABBBBBBBAAA" | false
    }
}
