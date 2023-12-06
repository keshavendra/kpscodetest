package com.testds.leetcode.problems.totalMoneyInLeetcodeBank

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test TotalMoneyInLeetcodeBank"() {
        when:
        def actualResult = solution.totalMoney(n)
        then:
        expectedResult == actualResult
        where:
        n  | expectedResult
        4  | 10
        10 | 37
        20 | 96
    }

}
