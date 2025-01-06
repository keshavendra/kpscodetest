package com.testds.leetcode.problems.minOperationsToMakeAll1s

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinOperations"() {
        when:
        def actualResult = solution.minOperations(boxes)
        then:
        expectedResult as int[] == actualResult
        where:
        boxes    | expectedResult
        "110"    | [1, 1, 3]
        "001011" | [11, 8, 5, 4, 3, 4]
    }

    def cleanup() {
        solution = null
    }

}
