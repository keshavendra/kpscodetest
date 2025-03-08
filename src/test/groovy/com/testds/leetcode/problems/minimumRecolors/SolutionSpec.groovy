package com.testds.leetcode.problems.minimumRecolors

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinimumRecolors"() {
        when:
        def actualResult = solution.minimumRecolors(blocks, k)
        then:
        expectedResult == actualResult
        where:
        blocks       | k | expectedResult
        "WBBWWBBWBW" | 7 | 3
        "WBWBBBW"    | 2 | 0
    }

    def cleanup() {
        solution = null
    }

}
