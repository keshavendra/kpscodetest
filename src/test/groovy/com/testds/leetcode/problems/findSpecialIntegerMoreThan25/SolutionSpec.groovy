package com.testds.leetcode.problems.findSpecialIntegerMoreThan25

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindSpecialIntegerMoreThan25"() {
        when:
        def actualResult = solution.findSpecialInteger(arr as int[])
        then:
        expectedResult == actualResult
        where:
        arr                          | expectedResult
        [1, 2, 2, 6, 6, 6, 6, 7, 10] | 6
        [1, 1]                       | 1
    }

}
