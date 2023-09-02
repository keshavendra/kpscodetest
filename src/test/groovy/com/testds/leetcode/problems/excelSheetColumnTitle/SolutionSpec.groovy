package com.testds.leetcode.problems.excelSheetColumnTitle

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test excelColumnTitle for different inputs and results"() {
        when:
        def actualResult = solution.convertToTitle(columnNumber)
        then:
        assert expectedResult == actualResult
        where:
        columnNumber | expectedResult
        1            | "A"
        28           | "AB"
        701          | "ZY"
        52           | "AZ"
        78           | "BZ"
        703          | "AAA"
    }
}
