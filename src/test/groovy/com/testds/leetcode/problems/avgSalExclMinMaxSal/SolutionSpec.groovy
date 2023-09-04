package com.testds.leetcode.problems.avgSalExclMinMaxSal

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "test different int array for avgSalExclMinMaxSal"() {
        when:
        def actualAvg = solution.average(salary as int[])
        then:
        actualAvg == expectedAvg as double
        where:
        salary                   | expectedAvg
        [4000, 3000, 1000, 2000] | 2500.00000
        [1000, 2000, 3000]       | 2000.00000
    }
}
