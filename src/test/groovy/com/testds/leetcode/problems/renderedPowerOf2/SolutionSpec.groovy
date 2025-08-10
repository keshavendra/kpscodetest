package com.testds.leetcode.problems.renderedPowerOf2

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ReorderedPowerOf2"() {
        when:
        def actualResult = solution.reorderedPowerOf2(n)
        then:
        expectedResult == actualResult
        where:
        n    | expectedResult
        1    | true
        10   | false
        46   | true
        218  | true
        2128 | false
    }

    def cleanup() {
        solution = null
    }

}
