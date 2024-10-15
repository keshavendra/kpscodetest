package com.testds.leetcode.problems.separateBlkWhtBalls

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SeparateBlkWhtBalls"() {
        when:
        def actualResult = solution.minimumSteps(s)
        then:
        expectedResult as long== actualResult
        where:
        s      | expectedResult
        "101"  | 1
        "100"  | 2
        "0111" | 0
    }

    def cleanup() {
        solution = null
    }

}
