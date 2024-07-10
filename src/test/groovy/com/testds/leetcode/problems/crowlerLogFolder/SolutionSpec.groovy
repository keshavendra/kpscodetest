package com.testds.leetcode.problems.crowlerLogFolder

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CrowlerLogFolder"() {
        when:
        def actualResult = solution.minOperations(logs as String[])
        then:
        expectedResult == actualResult
        where:
        logs                | expectedResult
        ["./", "../", "./"] | 0
    }

}
