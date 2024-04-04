package com.testds.leetcode.problems.maxNestingDpthOfParantheses

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxNestingDpthOfParantheses"() {
        when:
        def actualResult = solution.maxDepth(s)
        then:
        expectedResult == actualResult
        where:
        s                     | expectedResult
        "(1+(2*3)+((8)/4))+1" | 3
        "(1)+((2))+(((3)))"   | 3
    }

}
