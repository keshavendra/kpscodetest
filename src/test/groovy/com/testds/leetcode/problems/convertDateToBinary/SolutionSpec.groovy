package com.testds.leetcode.problems.convertDateToBinary

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ConvertDateToBinary"() {
        when:
        def actualResult = solution.convertDateToBinary(date)
        then:
        expectedResult == actualResult
        where:
        date         | expectedResult
        "2080-02-29" | "100000100000-10-11101"
        "1900-01-01" | "11101101100-1-1"
    }
}
