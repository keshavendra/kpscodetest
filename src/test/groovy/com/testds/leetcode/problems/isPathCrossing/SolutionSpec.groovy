package com.testds.leetcode.problems.isPathCrossing

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test IsPathCrossing"() {
        when:
        def actualResult = solution.isPathCrossing(path)
        then:
        expectedResult == actualResult
        where:
        path    | expectedResult
        "NES"   | false
        "NESWW" | true
    }

}
