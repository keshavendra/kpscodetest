package com.testds.leetcode.problems.buy2Chocolates

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test Buy2Chocolates"() {
        when:
        def actualResult = solution.buyChoco(prices as int[], money)
        then:
        expectedResult == actualResult
        where:
        prices    | money | expectedResult
        [1, 2, 2] | 3     | 0
        [3, 2, 3] | 3     | 3
    }

}
