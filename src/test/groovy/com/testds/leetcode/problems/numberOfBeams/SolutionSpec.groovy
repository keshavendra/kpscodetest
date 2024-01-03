package com.testds.leetcode.problems.numberOfBeams

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test NumberOfBeams"() {
        when:
        def actualResult = solution.numberOfBeams(bank as String[])
        then:
        expectedResult == actualResult
        where:
        bank                                     | expectedResult
        ["011001", "000000", "010100", "001000"] | 8
        ["000", "111", "000"]                    | 0
    }

}
