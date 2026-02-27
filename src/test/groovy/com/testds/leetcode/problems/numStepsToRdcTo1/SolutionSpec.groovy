package com.testds.leetcode.problems.numStepsToRdcTo1

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test NumSteps"() {
        when:
        def actualResult = solution.numSteps(s)
        then:
        expectedResult == actualResult
        where:
        s       | expectedResult
        "1101"  | 6
        "10"    | 1
        "1"     | 0
        "11000" | 6
    }

    def cleanup() {
        solution = null
    }

}
