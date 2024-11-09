package com.testds.leetcode.problems.minArrayEnd

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinArrayEnd"() {
        when:
        def actualResult = solution.minEnd(n, x)
        then:
        expectedResult as long == actualResult
        where:
        n | x | expectedResult
        3 | 4 | 6
        2 | 7 | 15
    }

}
