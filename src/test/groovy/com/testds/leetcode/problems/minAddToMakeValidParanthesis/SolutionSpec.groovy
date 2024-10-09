package com.testds.leetcode.problems.minAddToMakeValidParanthesis

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinAddToMakeValidParanthesis"() {
        when:
        def actualResult = solution.minAddToMakeValid(s)
        then:
        expectedResult == actualResult
        where:
        s     | expectedResult
        "())" | 1
        "(((" | 3
    }

}
