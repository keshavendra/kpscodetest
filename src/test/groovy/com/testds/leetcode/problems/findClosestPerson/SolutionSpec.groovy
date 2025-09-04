package com.testds.leetcode.problems.findClosestPerson

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindClosest"() {
        when:
        def actualResult = solution.findClosest(x, y, z)
        then:
        expectedResult == actualResult
        where:
        x | y | z | expectedResult
        2 | 7 | 4 | 1
        2 | 5 | 6 | 2
        1 | 5 | 3 | 0
    }

    def cleanup() {
        solution = null
    }

}
